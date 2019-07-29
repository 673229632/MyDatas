//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionInfectionDiseases;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionInfectionDiseasesExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionInfectionDiseasesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionInfectionDiseasesMapper.
 */
public interface PdDPatientInspectionInfectionDiseasesMapper extends AutoGenMapper<PdDPatientInspectionInfectionDiseases, PdDPatientInspectionInfectionDiseasesExample>, AutoGenMapper.Insertable<PdDPatientInspectionInfectionDiseases>, AutoGenMapper.Updatable<PdDPatientInspectionInfectionDiseases, PdDPatientInspectionInfectionDiseasesExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionInfectionDiseases, PdDPatientInspectionInfectionDiseasesExample>, AutoGenMapper.Deletable<PdDPatientInspectionInfectionDiseasesExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionInfectionDiseasesExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionInfectionDiseasesExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionInfectionDiseasesExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionInfectionDiseasesExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionInfectionDiseasesKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionInfectionDiseasesKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionInfectionDiseases
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionInfectionDiseases record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionInfectionDiseases
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionInfectionDiseases record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionInfectionDiseasesExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionInfectionDiseases> selectByExample(PdDPatientInspectionInfectionDiseasesExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionInfectionDiseasesKey
     * @return 结果
     */
    PdDPatientInspectionInfectionDiseases selectByPrimaryKey(PdDPatientInspectionInfectionDiseasesKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionInfectionDiseases
     * @param example PdDPatientInspectionInfectionDiseasesExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionInfectionDiseases record, @Param("example") PdDPatientInspectionInfectionDiseasesExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionInfectionDiseases
     * @param example PdDPatientInspectionInfectionDiseasesExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionInfectionDiseases record, @Param("example") PdDPatientInspectionInfectionDiseasesExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionInfectionDiseases
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionInfectionDiseases record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionInfectionDiseases
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionInfectionDiseases record);
}