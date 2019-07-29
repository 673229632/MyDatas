//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBloodCoagulation;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBloodCoagulationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBloodCoagulationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionBloodCoagulationMapper.
 */
public interface PdDPatientInspectionBloodCoagulationMapper extends AutoGenMapper<PdDPatientInspectionBloodCoagulation, PdDPatientInspectionBloodCoagulationExample>, AutoGenMapper.Insertable<PdDPatientInspectionBloodCoagulation>, AutoGenMapper.Updatable<PdDPatientInspectionBloodCoagulation, PdDPatientInspectionBloodCoagulationExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionBloodCoagulation, PdDPatientInspectionBloodCoagulationExample>, AutoGenMapper.Deletable<PdDPatientInspectionBloodCoagulationExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionBloodCoagulationExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionBloodCoagulationExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionBloodCoagulationExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionBloodCoagulationExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionBloodCoagulationKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionBloodCoagulationKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionBloodCoagulation
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionBloodCoagulation record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionBloodCoagulation
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionBloodCoagulation record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionBloodCoagulationExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionBloodCoagulation> selectByExample(PdDPatientInspectionBloodCoagulationExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionBloodCoagulationKey
     * @return 结果
     */
    PdDPatientInspectionBloodCoagulation selectByPrimaryKey(PdDPatientInspectionBloodCoagulationKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionBloodCoagulation
     * @param example PdDPatientInspectionBloodCoagulationExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionBloodCoagulation record, @Param("example") PdDPatientInspectionBloodCoagulationExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionBloodCoagulation
     * @param example PdDPatientInspectionBloodCoagulationExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionBloodCoagulation record, @Param("example") PdDPatientInspectionBloodCoagulationExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionBloodCoagulation
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionBloodCoagulation record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionBloodCoagulation
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionBloodCoagulation record);
}