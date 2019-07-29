//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckStandardVersion;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckStandardVersionExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckStandardVersionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMCheckStandardVersionMapper.
 */
public interface PdMCheckStandardVersionMapper extends AutoGenMapper<PdMCheckStandardVersion, PdMCheckStandardVersionExample>, AutoGenMapper.Insertable<PdMCheckStandardVersion>, AutoGenMapper.Updatable<PdMCheckStandardVersion, PdMCheckStandardVersionExample>, AutoGenMapper.UpdatableSelective<PdMCheckStandardVersion, PdMCheckStandardVersionExample>, AutoGenMapper.Deletable<PdMCheckStandardVersionExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMCheckStandardVersionExample
     * @return 结果
     */
    int countByExample(PdMCheckStandardVersionExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMCheckStandardVersionExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMCheckStandardVersionExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMCheckStandardVersionKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMCheckStandardVersionKey key);

    /**
     * 插入数据.
     *
     * @param record PdMCheckStandardVersion
     * @return 结果
     */
    @Override
    int insert(PdMCheckStandardVersion record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMCheckStandardVersion
     * @return 结果
     */
    int insertSelective(PdMCheckStandardVersion record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMCheckStandardVersionExample
     * @return 结果
     */
    @Override
    List<PdMCheckStandardVersion> selectByExample(PdMCheckStandardVersionExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMCheckStandardVersionKey
     * @return 结果
     */
    PdMCheckStandardVersion selectByPrimaryKey(PdMCheckStandardVersionKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMCheckStandardVersion
     * @param example PdMCheckStandardVersionExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMCheckStandardVersion record, @Param("example") PdMCheckStandardVersionExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMCheckStandardVersion
     * @param example PdMCheckStandardVersionExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMCheckStandardVersion record, @Param("example") PdMCheckStandardVersionExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMCheckStandardVersion
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMCheckStandardVersion record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMCheckStandardVersion
     * @return 结果
     */
    int updateByPrimaryKey(PdMCheckStandardVersion record);
}