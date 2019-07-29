//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineUrine;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineUrineExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineUrineKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionRoutineUrineMapper.
 */
public interface PdDPatientInspectionRoutineUrineMapper extends AutoGenMapper<PdDPatientInspectionRoutineUrine, PdDPatientInspectionRoutineUrineExample>, AutoGenMapper.Insertable<PdDPatientInspectionRoutineUrine>, AutoGenMapper.Updatable<PdDPatientInspectionRoutineUrine, PdDPatientInspectionRoutineUrineExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionRoutineUrine, PdDPatientInspectionRoutineUrineExample>, AutoGenMapper.Deletable<PdDPatientInspectionRoutineUrineExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionRoutineUrineExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionRoutineUrineExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionRoutineUrineExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionRoutineUrineExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionRoutineUrineKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionRoutineUrineKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionRoutineUrine
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionRoutineUrine record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineUrine
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionRoutineUrine record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionRoutineUrineExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionRoutineUrine> selectByExample(PdDPatientInspectionRoutineUrineExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionRoutineUrineKey
     * @return 结果
     */
    PdDPatientInspectionRoutineUrine selectByPrimaryKey(PdDPatientInspectionRoutineUrineKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineUrine
     * @param example PdDPatientInspectionRoutineUrineExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionRoutineUrine record, @Param("example") PdDPatientInspectionRoutineUrineExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionRoutineUrine
     * @param example PdDPatientInspectionRoutineUrineExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionRoutineUrine record, @Param("example") PdDPatientInspectionRoutineUrineExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineUrine
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionRoutineUrine record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionRoutineUrine
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionRoutineUrine record);
}