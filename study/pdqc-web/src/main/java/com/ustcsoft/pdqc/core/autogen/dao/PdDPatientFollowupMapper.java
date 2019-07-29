//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientFollowup;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientFollowupExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientFollowupKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientFollowupMapper.
 */
public interface PdDPatientFollowupMapper extends AutoGenMapper<PdDPatientFollowup, PdDPatientFollowupExample>, AutoGenMapper.Insertable<PdDPatientFollowup>, AutoGenMapper.Updatable<PdDPatientFollowup, PdDPatientFollowupExample>, AutoGenMapper.UpdatableSelective<PdDPatientFollowup, PdDPatientFollowupExample>, AutoGenMapper.Deletable<PdDPatientFollowupExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientFollowupExample
     * @return 结果
     */
    int countByExample(PdDPatientFollowupExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientFollowupExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientFollowupExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientFollowupKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientFollowupKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientFollowup
     * @return 结果
     */
    @Override
    int insert(PdDPatientFollowup record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientFollowup
     * @return 结果
     */
    int insertSelective(PdDPatientFollowup record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientFollowupExample
     * @return 结果
     */
    @Override
    List<PdDPatientFollowup> selectByExample(PdDPatientFollowupExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientFollowupKey
     * @return 结果
     */
    PdDPatientFollowup selectByPrimaryKey(PdDPatientFollowupKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientFollowup
     * @param example PdDPatientFollowupExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientFollowup record, @Param("example") PdDPatientFollowupExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientFollowup
     * @param example PdDPatientFollowupExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientFollowup record, @Param("example") PdDPatientFollowupExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientFollowup
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientFollowup record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientFollowup
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientFollowup record);
}