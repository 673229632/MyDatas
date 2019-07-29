//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutcome;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutcomeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutcomeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientOutcomeMapper.
 */
public interface PdDPatientOutcomeMapper extends AutoGenMapper<PdDPatientOutcome, PdDPatientOutcomeExample>, AutoGenMapper.Insertable<PdDPatientOutcome>, AutoGenMapper.Updatable<PdDPatientOutcome, PdDPatientOutcomeExample>, AutoGenMapper.UpdatableSelective<PdDPatientOutcome, PdDPatientOutcomeExample>, AutoGenMapper.Deletable<PdDPatientOutcomeExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientOutcomeExample
     * @return 结果
     */
    int countByExample(PdDPatientOutcomeExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientOutcomeExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientOutcomeExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientOutcomeKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientOutcomeKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientOutcome
     * @return 结果
     */
    @Override
    int insert(PdDPatientOutcome record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientOutcome
     * @return 结果
     */
    int insertSelective(PdDPatientOutcome record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientOutcomeExample
     * @return 结果
     */
    @Override
    List<PdDPatientOutcome> selectByExample(PdDPatientOutcomeExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientOutcomeKey
     * @return 结果
     */
    PdDPatientOutcome selectByPrimaryKey(PdDPatientOutcomeKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientOutcome
     * @param example PdDPatientOutcomeExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientOutcome record, @Param("example") PdDPatientOutcomeExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientOutcome
     * @param example PdDPatientOutcomeExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientOutcome record, @Param("example") PdDPatientOutcomeExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientOutcome
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientOutcome record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientOutcome
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientOutcome record);
}