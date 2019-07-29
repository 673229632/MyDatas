//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDApproveFile;
import com.ustcsoft.pdqc.core.autogen.entity.PdDApproveFileExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDApproveFileKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDApproveFileMapper.
 */
public interface PdDApproveFileMapper extends AutoGenMapper<PdDApproveFile, PdDApproveFileExample>, AutoGenMapper.Insertable<PdDApproveFile>, AutoGenMapper.Updatable<PdDApproveFile, PdDApproveFileExample>, AutoGenMapper.UpdatableSelective<PdDApproveFile, PdDApproveFileExample>, AutoGenMapper.Deletable<PdDApproveFileExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDApproveFileExample
     * @return 结果
     */
    int countByExample(PdDApproveFileExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDApproveFileExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDApproveFileExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDApproveFileKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDApproveFileKey key);

    /**
     * 插入数据.
     *
     * @param record PdDApproveFile
     * @return 结果
     */
    @Override
    int insert(PdDApproveFile record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDApproveFile
     * @return 结果
     */
    int insertSelective(PdDApproveFile record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDApproveFileExample
     * @return 结果
     */
    @Override
    List<PdDApproveFile> selectByExample(PdDApproveFileExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDApproveFileKey
     * @return 结果
     */
    PdDApproveFile selectByPrimaryKey(PdDApproveFileKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDApproveFile
     * @param example PdDApproveFileExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDApproveFile record, @Param("example") PdDApproveFileExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDApproveFile
     * @param example PdDApproveFileExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDApproveFile record, @Param("example") PdDApproveFileExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDApproveFile
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDApproveFile record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDApproveFile
     * @return 结果
     */
    int updateByPrimaryKey(PdDApproveFile record);
}