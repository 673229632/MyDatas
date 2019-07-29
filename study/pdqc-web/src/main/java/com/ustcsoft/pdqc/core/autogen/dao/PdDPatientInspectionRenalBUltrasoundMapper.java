//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRenalBUltrasound;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRenalBUltrasoundExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRenalBUltrasoundKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionRenalBUltrasoundMapper.
 */
public interface PdDPatientInspectionRenalBUltrasoundMapper extends AutoGenMapper<PdDPatientInspectionRenalBUltrasound, PdDPatientInspectionRenalBUltrasoundExample>, AutoGenMapper.Insertable<PdDPatientInspectionRenalBUltrasound>, AutoGenMapper.Updatable<PdDPatientInspectionRenalBUltrasound, PdDPatientInspectionRenalBUltrasoundExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionRenalBUltrasound, PdDPatientInspectionRenalBUltrasoundExample>, AutoGenMapper.Deletable<PdDPatientInspectionRenalBUltrasoundExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionRenalBUltrasoundExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionRenalBUltrasoundExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionRenalBUltrasoundExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionRenalBUltrasoundExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionRenalBUltrasoundKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionRenalBUltrasoundKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionRenalBUltrasound
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionRenalBUltrasound record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionRenalBUltrasound
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionRenalBUltrasound record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionRenalBUltrasoundExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionRenalBUltrasound> selectByExample(PdDPatientInspectionRenalBUltrasoundExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionRenalBUltrasoundKey
     * @return 结果
     */
    PdDPatientInspectionRenalBUltrasound selectByPrimaryKey(PdDPatientInspectionRenalBUltrasoundKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionRenalBUltrasound
     * @param example PdDPatientInspectionRenalBUltrasoundExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionRenalBUltrasound record, @Param("example") PdDPatientInspectionRenalBUltrasoundExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionRenalBUltrasound
     * @param example PdDPatientInspectionRenalBUltrasoundExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionRenalBUltrasound record, @Param("example") PdDPatientInspectionRenalBUltrasoundExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionRenalBUltrasound
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionRenalBUltrasound record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionRenalBUltrasound
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionRenalBUltrasound record);
}