//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineBlood;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineBloodExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineBloodKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionRoutineBloodMapper.
 */
public interface PdDPatientInspectionRoutineBloodMapper extends AutoGenMapper<PdDPatientInspectionRoutineBlood, PdDPatientInspectionRoutineBloodExample>, AutoGenMapper.Insertable<PdDPatientInspectionRoutineBlood>, AutoGenMapper.Updatable<PdDPatientInspectionRoutineBlood, PdDPatientInspectionRoutineBloodExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionRoutineBlood, PdDPatientInspectionRoutineBloodExample>, AutoGenMapper.Deletable<PdDPatientInspectionRoutineBloodExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionRoutineBloodExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionRoutineBloodExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionRoutineBloodExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionRoutineBloodExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionRoutineBloodKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionRoutineBloodKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionRoutineBlood
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionRoutineBlood record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineBlood
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionRoutineBlood record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionRoutineBloodExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionRoutineBlood> selectByExample(PdDPatientInspectionRoutineBloodExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionRoutineBloodKey
     * @return 结果
     */
    PdDPatientInspectionRoutineBlood selectByPrimaryKey(PdDPatientInspectionRoutineBloodKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineBlood
     * @param example PdDPatientInspectionRoutineBloodExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionRoutineBlood record, @Param("example") PdDPatientInspectionRoutineBloodExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionRoutineBlood
     * @param example PdDPatientInspectionRoutineBloodExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionRoutineBlood record, @Param("example") PdDPatientInspectionRoutineBloodExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineBlood
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionRoutineBlood record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionRoutineBlood
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionRoutineBlood record);
}