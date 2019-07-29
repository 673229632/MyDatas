//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineStool;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineStoolExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionRoutineStoolKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionRoutineStoolMapper.
 */
public interface PdDPatientInspectionRoutineStoolMapper extends AutoGenMapper<PdDPatientInspectionRoutineStool, PdDPatientInspectionRoutineStoolExample>, AutoGenMapper.Insertable<PdDPatientInspectionRoutineStool>, AutoGenMapper.Updatable<PdDPatientInspectionRoutineStool, PdDPatientInspectionRoutineStoolExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionRoutineStool, PdDPatientInspectionRoutineStoolExample>, AutoGenMapper.Deletable<PdDPatientInspectionRoutineStoolExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionRoutineStoolExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionRoutineStoolExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionRoutineStoolExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionRoutineStoolExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionRoutineStoolKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionRoutineStoolKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionRoutineStool
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionRoutineStool record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineStool
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionRoutineStool record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionRoutineStoolExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionRoutineStool> selectByExample(PdDPatientInspectionRoutineStoolExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionRoutineStoolKey
     * @return 结果
     */
    PdDPatientInspectionRoutineStool selectByPrimaryKey(PdDPatientInspectionRoutineStoolKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineStool
     * @param example PdDPatientInspectionRoutineStoolExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionRoutineStool record, @Param("example") PdDPatientInspectionRoutineStoolExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionRoutineStool
     * @param example PdDPatientInspectionRoutineStoolExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionRoutineStool record, @Param("example") PdDPatientInspectionRoutineStoolExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionRoutineStool
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionRoutineStool record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionRoutineStool
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionRoutineStool record);
}