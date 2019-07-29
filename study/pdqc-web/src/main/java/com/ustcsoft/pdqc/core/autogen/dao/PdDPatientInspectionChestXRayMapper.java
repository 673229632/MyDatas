//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionChestXRay;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionChestXRayExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionChestXRayKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionChestXRayMapper.
 */
public interface PdDPatientInspectionChestXRayMapper extends AutoGenMapper<PdDPatientInspectionChestXRay, PdDPatientInspectionChestXRayExample>, AutoGenMapper.Insertable<PdDPatientInspectionChestXRay>, AutoGenMapper.Updatable<PdDPatientInspectionChestXRay, PdDPatientInspectionChestXRayExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionChestXRay, PdDPatientInspectionChestXRayExample>, AutoGenMapper.Deletable<PdDPatientInspectionChestXRayExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionChestXRayExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionChestXRayExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionChestXRayExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionChestXRayExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionChestXRayKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionChestXRayKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionChestXRay
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionChestXRay record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionChestXRay
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionChestXRay record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionChestXRayExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionChestXRay> selectByExample(PdDPatientInspectionChestXRayExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionChestXRayKey
     * @return 结果
     */
    PdDPatientInspectionChestXRay selectByPrimaryKey(PdDPatientInspectionChestXRayKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionChestXRay
     * @param example PdDPatientInspectionChestXRayExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionChestXRay record, @Param("example") PdDPatientInspectionChestXRayExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionChestXRay
     * @param example PdDPatientInspectionChestXRayExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionChestXRay record, @Param("example") PdDPatientInspectionChestXRayExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionChestXRay
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionChestXRay record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionChestXRay
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionChestXRay record);
}