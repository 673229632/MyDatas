//******************************************************************************
// 版权所有(c) 2016，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.web.common.service.impl;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.multipart.MultipartFile;

import com.ustcsoft.marsfw.spring.util.ConfigUtil;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonPagginListReturn;
import com.ustcsoft.mybatis.autogen.entity.AutoGenEntity;
import com.ustcsoft.mybatis.autogen.entity.AutoGenEntityWithBLOBs;
import com.ustcsoft.mybatis.autogen.entity.AutoGenExample;
import com.ustcsoft.mybatis.autogen.entity.ModelColumn;
import com.ustcsoft.mybatis.autogen.entity.ModelColumnSupport;
import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.mybatis.autogen.mapper.AutoGenWithBLOBsMapper;
import com.ustcsoft.mybatis.paging.Paging;
import com.ustcsoft.mybatis.paging.result.PagingResult;
import com.ustcsoft.pdqc.core.common.entity.CoreDBEntity;
import com.ustcsoft.pdqc.web.common.constants.WebCommonConstants;
import com.ustcsoft.pdqc.web.common.dao.WebCommonDao;
import com.ustcsoft.pdqc.web.common.entity.RetMsg;
import com.ustcsoft.pdqc.web.common.entity.WebBaseCondEntity;
import com.ustcsoft.pdqc.web.common.form.WebForm;
import com.ustcsoft.pdqc.web.common.form.WebPagingForm;
import com.ustcsoft.pdqc.web.common.security.LoginPrincipal;
import com.ustcsoft.pdqc.web.common.security.LoginUser;
import com.ustcsoft.pdqc.web.common.service.WebBaseService;
import com.ustcsoft.pdqc.web.common.util.SecurityUtil;

/**
 * WEB模块共通Service实现类（本类携带DAO的注入）.
 * 
 * @author kxiong
 *
 */
@Service
public class WebBaseServiceImpl extends WebApplicationObjectSupport implements WebBaseService, WebCommonConstants {

    // 日志对象
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WebCommonDao webCommonDao;

    /**
     * 获得用户的Principal.
     * 
     * @return Principal
     */
    protected LoginPrincipal getPrincipal() {
        return SecurityUtil.getPrincipal();
    }

    /**
     * 获得当前登录用户的信息.
     * 
     * @return 用户的信息
     */
    protected LoginUser getLoginUser() {
        LoginUser user = null;
        try {
            user = SecurityUtil.getLoginUser();
        } catch (Exception e) {
            user = new LoginUser();
            //user.setId(ConfigUtil.getProperty("endDoctor", "0000"));
            user.setUserNo(ConfigUtil.getProperty("endDoctor", "0000"));
        }
        return user;
    }

    /**
     * 保存文件.
     * 
     * @param file 上传的文件对象
     * @param filePath 本地保存路径
     * @throws Exception 异常
     */
    protected void saveFile(MultipartFile file, String filePath) throws Exception {
        if (file == null) {
            return;
        }
        File localFile = new File(filePath);
        if (!localFile.exists() && !localFile.isDirectory()) {
            // 创建目录
            localFile.mkdirs();
        }
        file.transferTo(localFile);
    }

    /**
     * 获得文件上传的根目录（配置文件中'file.storage.root'对应的路径）
     * 
     * @return 路径（结尾带斜杠）
     */
    protected String getFileUploadRoot() {
        // 返回
        String path = ConfigUtil.getProperty(CONFIG_FILE_UPLOAD_ROOT, System.getProperty("java.io.tmpdir"));
        if (path == null) {
            return File.separator;
        }
        // 如果不以斜杠结尾，则拼接
        if (!path.endsWith(File.separator)) {
            path = path + File.separator;
        }
        return path;
    }

    /**
     * 创建分页对象.
     * 
     * @param form Form
     * 
     * @return 分页对象.
     */
    protected Paging createPaging(WebPagingForm form) {
        // 如果不需要分页
        if (form == null || !form.isBackPage()) {
            return null;
        }
        // 创建分页对象
        Paging paging = new Paging(form.getPageNumber(), form.getPageSize());
        return paging;
    }

    /**
     * 设定排序条件到example中.
     * 
     * @param form 查询条件
     * @param example 自动生成的Example
     */
    protected void fillOrderByClause(WebPagingForm form, AutoGenExample example) {
        // 如果不需要排序
        if (form.getSortName() == null) {
            return;
        }
        // 如果不是ModelColumnSupport子类
        if (!(example instanceof ModelColumnSupport)) {
            // 抛出异常
            throw new IllegalArgumentException("Argument example must be a instance of ModelColumnSupport");
        }
        // 获得安全的排序字符串
        String orderByClause = getOrderByClauseSafe(form, ((ModelColumnSupport) example).getColumnList());
        // 如果不为null
        if (orderByClause != null) {
            // 设定排序条件
            example.setOrderByClause(orderByClause);
        }
    }

    /**
     * 生成安全的排序字符串（以Java类的变量名为匹配，找不到返回空字符串）.
     * 
     * @param form 检索条件Form
     * @param columnList 列定义类
     * @return 安全的排序字符串
     */
    protected String getOrderByClauseSafe(WebPagingForm form, ModelColumn[] columnList) {
        // 排序字符串
        String orderByClause = null;
        // 如果列定义为空
        if (columnList == null) {
            return null;
        }
        // 遍历所有的列
        for (ModelColumn modelColumn : columnList) {
            // 如果JAVA名字或者DB名字匹配，则作为对象，否则不作为排序条件
            if (modelColumn.getJavaName().equalsIgnoreCase(form.getSortName())
                    || modelColumn.getName().equalsIgnoreCase(form.getSortName())) {
                // 获得排序的DB列
                orderByClause = modelColumn.getName();
                // 判断排序方向
                if ("desc".equalsIgnoreCase(form.getSortOrder())) {
                    // 逆序
                    orderByClause += " desc";
                }
                break;
            }
        }
        return orderByClause;
    }

    /**
     * 复制分页条件(Form->Entity).
     * 
     * @param form Form
     * @param entity Entity
     */
    protected void copyPagingCondition(WebPagingForm form, WebBaseCondEntity entity) {
        if (form == null || entity == null) {
            return;
        }
        // 如果分页信息没有复制
        if (entity != null && entity.getPaging() == null && form != null) {
            // 设定分页对象
            entity.setPaging(createPaging(form));
        }
    }

    /**
     * 复制分页结果(PagingResult->JacksonPagginListReturn).
     * 
     * @param pagingResult 分页结果
     * @param jackson Json结果
     */
    protected void copyPagingResult(PagingResult<?> pagingResult, JacksonPagginListReturn<?> jackson) {
        if (pagingResult == null || jackson == null) {
            return;
        }
        // 当前页码(默认第一页).
        jackson.setPageNumber(pagingResult.getPageNum());
        // 总页码.
        jackson.setPageCount(pagingResult.getPageCount());
        // 总记录件数.
        jackson.setTotalCount(pagingResult.getTotalCount());
        // 件数
        jackson.setDataCount(pagingResult.getResultCount());
    }

    /**
     * 类型转换接口.
     * 
     * @author kxiong
     *
     * @param <S> 转换元
     * @param <D> 转换目标
     */
    protected static interface Convertor<S, D> {
        /**
         * 转换函数.
         * 
         * @param sobj 转换元
         * @return 转换目标
         */
        D convert(S sobj);
    }

    /**
     * 转换分页查询结果到JSON返回结果.
     * 
     * @param <E> Entity对象
     * @param <F> Form对象
     * @param pagingResult 分页查询结果
     * @param convertor 类型转换类
     * @return JSON返回结果
     */
    protected <E extends CoreDBEntity, F extends WebForm> JacksonPagginListReturn<F> convertPagingResult(
            PagingResult<E> pagingResult, Convertor<E, F> convertor) {
        // 创建JSON结果
        JacksonPagginListReturn<F> reuslt = new JacksonPagginListReturn<F>();
        // 遍历检索结果
        for (E e : pagingResult.getResultData()) {
            // 转换并且添加到Json结果集
            reuslt.getData().add(convertor.convert(e));
        }
        // 复制分页结果
        copyPagingResult(pagingResult, reuslt);
        // 返回
        return reuslt;
    }

    /**
     * 带大数据的表.
     * 
     * @param mapper 操作数据库的对象
     * @param record 操作的数据对象
     * @param example 查询条件对象
     */
    public <T extends AutoGenEntityWithBLOBs, E extends AutoGenExample> RetMsg updateWithTranBlobs(
            AutoGenWithBLOBsMapper.Updatable mapper, T record, E example) {
        String result = "";
        int code = mapper.updateByExampleWithBLOBs(record, example);
        if (code == 0) {
            result = "该条信息已被其它用户修改，请刷新画面后重试！";
        } else {
            result = "数据修改成功！";
        }
        RetMsg ret = new RetMsg();
        ret.setRetMsg(result);
        ret.setRetCode(code);
        return ret;
    }
    
    /**
     * 不带大数据的表.
     * 
     * @param mapper 操作数据库的对象
     * @param record 操作的数据对象
     * @param example 查询条件对象
     */
    public <T extends AutoGenEntityWithBLOBs, E extends AutoGenExample> RetMsg updateWithTranBlobsIsSelective(
            AutoGenWithBLOBsMapper.UpdatableSelective mapper, T record, E example) {
        String result = "";
        int code = mapper.updateByExampleSelective(record, example);
        if (code == 0) {
            result = "该条信息已被其它用户修改，请刷新画面后重试！";
        } else {
            result = "数据修改成功！";
        }
        RetMsg ret = new RetMsg();
        ret.setRetMsg(result);
        ret.setRetCode(code);
        return ret;
    }

    /**
     * 不带大数据的表.
     * 
     * @param mapper 操作数据库的对象
     * @param record 操作的数据对象
     * @param example 查询条件对象
     */
    public <T extends AutoGenEntity, E extends AutoGenExample> RetMsg updateWithTran(AutoGenMapper.Updatable mapper,
            T record, E example) {
        String result = "";
        int  code = mapper.updateByExample(record, example);
        if (code == 0) {
            result = "该条信息已被其它用户修改，请刷新画面后重试！";
        } else {
            result = "数据修改成功！";
        }
        RetMsg ret = new RetMsg();
        ret.setRetMsg(result);
        ret.setRetCode(code);
        return ret;
    }
    
    /**
     * 不带大数据的表.
     * 
     * @param mapper 操作数据库的对象
     * @param record 操作的数据对象
     * @param example 查询条件对象
     */
    public <T extends AutoGenEntity, E extends AutoGenExample> RetMsg updateWithTranIsSelective(AutoGenMapper.UpdatableSelective mapper,
            T record, E example) {
        String result = "";
        int code = mapper.updateByExampleSelective(record, example);
        if (code == 0) {
            result = "该条信息已被其它用户修改，请刷新画面后重试！";
        } else {
            result = "数据修改成功！";
        }
        RetMsg ret = new RetMsg();
        ret.setRetMsg(result);
        ret.setRetCode(code);
        return ret;
    }

    /**
     * webCommonDao的GET方法.
     *
     * @return webCommonDao
     */
    public WebCommonDao getWebCommonDao() {
        return webCommonDao;
    }

    /**
     * webCommonDao的SET方法.
     *
     * @param webCommonDao webCommonDao
     */
    public void setWebCommonDao(WebCommonDao webCommonDao) {
        this.webCommonDao = webCommonDao;
    }

}
