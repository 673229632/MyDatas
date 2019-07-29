//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionElectrocardiogram;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionElectrocardiogramExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionElectrocardiogramKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionElectrocardiogramMapper.
 */
public interface PdDPatientInspectionElectrocardiogramMapper extends AutoGenMapper<PdDPatientInspectionElectrocardiogram, PdDPatientInspectionElectrocardiogramExample>, AutoGenMapper.Insertable<PdDPatientInspectionElectrocardiogram>, AutoGenMapper.Updatable<PdDPatientInspectionElectrocardiogram, PdDPatientInspectionElectrocardiogramExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionElectrocardiogram, PdDPatientInspectionElectrocardiogramExample>, AutoGenMapper.Deletable<PdDPatientInspectionElectrocardiogramExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionElectrocardiogramExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionElectrocardiogramExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionElectrocardiogramExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionElectrocardiogramExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionElectrocardiogramKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionElectrocardiogramKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionElectrocardiogram
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionElectrocardiogram record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionElectrocardiogram
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionElectrocardiogram record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionElectrocardiogramExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionElectrocardiogram> selectByExample(PdDPatientInspectionElectrocardiogramExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionElectrocardiogramKey
     * @return 结果
     */
    PdDPatientInspectionElectrocardiogram selectByPrimaryKey(PdDPatientInspectionElectrocardiogramKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionElectrocardiogram
     * @param example PdDPatientInspectionElectrocardiogramExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionElectrocardiogram record, @Param("example") PdDPatientInspectionElectrocardiogramExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionElectrocardiogram
     * @param example PdDPatientInspectionElectrocardiogramExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionElectrocardiogram record, @Param("example") PdDPatientInspectionElectrocardiogramExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionElectrocardiogram
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionElectrocardiogram record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionElectrocardiogram
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionElectrocardiogram record);
}