//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMSysFunc;
import com.ustcsoft.pdqc.core.autogen.entity.PdMSysFuncExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMSysFuncKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMSysFuncMapper.
 */
public interface PdMSysFuncMapper extends AutoGenMapper<PdMSysFunc, PdMSysFuncExample>, AutoGenMapper.Insertable<PdMSysFunc>, AutoGenMapper.Updatable<PdMSysFunc, PdMSysFuncExample>, AutoGenMapper.UpdatableSelective<PdMSysFunc, PdMSysFuncExample>, AutoGenMapper.Deletable<PdMSysFuncExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMSysFuncExample
     * @return 结果
     */
    int countByExample(PdMSysFuncExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMSysFuncExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMSysFuncExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMSysFuncKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMSysFuncKey key);

    /**
     * 插入数据.
     *
     * @param record PdMSysFunc
     * @return 结果
     */
    @Override
    int insert(PdMSysFunc record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMSysFunc
     * @return 结果
     */
    int insertSelective(PdMSysFunc record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMSysFuncExample
     * @return 结果
     */
    @Override
    List<PdMSysFunc> selectByExample(PdMSysFuncExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMSysFuncKey
     * @return 结果
     */
    PdMSysFunc selectByPrimaryKey(PdMSysFuncKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMSysFunc
     * @param example PdMSysFuncExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMSysFunc record, @Param("example") PdMSysFuncExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMSysFunc
     * @param example PdMSysFuncExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMSysFunc record, @Param("example") PdMSysFuncExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMSysFunc
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMSysFunc record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMSysFunc
     * @return 结果
     */
    int updateByPrimaryKey(PdMSysFunc record);
}