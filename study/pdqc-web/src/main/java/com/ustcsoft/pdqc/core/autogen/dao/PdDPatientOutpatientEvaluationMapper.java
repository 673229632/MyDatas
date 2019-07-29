//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutpatientEvaluation;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutpatientEvaluationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientOutpatientEvaluationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientOutpatientEvaluationMapper.
 */
public interface PdDPatientOutpatientEvaluationMapper extends AutoGenMapper<PdDPatientOutpatientEvaluation, PdDPatientOutpatientEvaluationExample>, AutoGenMapper.Insertable<PdDPatientOutpatientEvaluation>, AutoGenMapper.Updatable<PdDPatientOutpatientEvaluation, PdDPatientOutpatientEvaluationExample>, AutoGenMapper.UpdatableSelective<PdDPatientOutpatientEvaluation, PdDPatientOutpatientEvaluationExample>, AutoGenMapper.Deletable<PdDPatientOutpatientEvaluationExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientOutpatientEvaluationExample
     * @return 结果
     */
    int countByExample(PdDPatientOutpatientEvaluationExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientOutpatientEvaluationExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientOutpatientEvaluationExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientOutpatientEvaluationKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientOutpatientEvaluationKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientOutpatientEvaluation
     * @return 结果
     */
    @Override
    int insert(PdDPatientOutpatientEvaluation record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientOutpatientEvaluation
     * @return 结果
     */
    int insertSelective(PdDPatientOutpatientEvaluation record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientOutpatientEvaluationExample
     * @return 结果
     */
    @Override
    List<PdDPatientOutpatientEvaluation> selectByExample(PdDPatientOutpatientEvaluationExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientOutpatientEvaluationKey
     * @return 结果
     */
    PdDPatientOutpatientEvaluation selectByPrimaryKey(PdDPatientOutpatientEvaluationKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientOutpatientEvaluation
     * @param example PdDPatientOutpatientEvaluationExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientOutpatientEvaluation record, @Param("example") PdDPatientOutpatientEvaluationExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientOutpatientEvaluation
     * @param example PdDPatientOutpatientEvaluationExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientOutpatientEvaluation record, @Param("example") PdDPatientOutpatientEvaluationExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientOutpatientEvaluation
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientOutpatientEvaluation record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientOutpatientEvaluation
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientOutpatientEvaluation record);
}