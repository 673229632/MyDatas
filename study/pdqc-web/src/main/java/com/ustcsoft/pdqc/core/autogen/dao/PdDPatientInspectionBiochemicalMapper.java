//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBiochemical;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBiochemicalExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInspectionBiochemicalKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInspectionBiochemicalMapper.
 */
public interface PdDPatientInspectionBiochemicalMapper extends AutoGenMapper<PdDPatientInspectionBiochemical, PdDPatientInspectionBiochemicalExample>, AutoGenMapper.Insertable<PdDPatientInspectionBiochemical>, AutoGenMapper.Updatable<PdDPatientInspectionBiochemical, PdDPatientInspectionBiochemicalExample>, AutoGenMapper.UpdatableSelective<PdDPatientInspectionBiochemical, PdDPatientInspectionBiochemicalExample>, AutoGenMapper.Deletable<PdDPatientInspectionBiochemicalExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInspectionBiochemicalExample
     * @return 结果
     */
    int countByExample(PdDPatientInspectionBiochemicalExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInspectionBiochemicalExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInspectionBiochemicalExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInspectionBiochemicalKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInspectionBiochemicalKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInspectionBiochemical
     * @return 结果
     */
    @Override
    int insert(PdDPatientInspectionBiochemical record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInspectionBiochemical
     * @return 结果
     */
    int insertSelective(PdDPatientInspectionBiochemical record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInspectionBiochemicalExample
     * @return 结果
     */
    @Override
    List<PdDPatientInspectionBiochemical> selectByExample(PdDPatientInspectionBiochemicalExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInspectionBiochemicalKey
     * @return 结果
     */
    PdDPatientInspectionBiochemical selectByPrimaryKey(PdDPatientInspectionBiochemicalKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionBiochemical
     * @param example PdDPatientInspectionBiochemicalExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInspectionBiochemical record, @Param("example") PdDPatientInspectionBiochemicalExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInspectionBiochemical
     * @param example PdDPatientInspectionBiochemicalExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInspectionBiochemical record, @Param("example") PdDPatientInspectionBiochemicalExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInspectionBiochemical
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInspectionBiochemical record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInspectionBiochemical
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInspectionBiochemical record);
}