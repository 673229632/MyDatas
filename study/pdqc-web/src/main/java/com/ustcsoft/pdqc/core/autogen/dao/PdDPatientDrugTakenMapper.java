//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDrugTaken;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDrugTakenExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDrugTakenKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDrugTakenMapper.
 */
public interface PdDPatientDrugTakenMapper extends AutoGenMapper<PdDPatientDrugTaken, PdDPatientDrugTakenExample>, AutoGenMapper.Insertable<PdDPatientDrugTaken>, AutoGenMapper.Updatable<PdDPatientDrugTaken, PdDPatientDrugTakenExample>, AutoGenMapper.UpdatableSelective<PdDPatientDrugTaken, PdDPatientDrugTakenExample>, AutoGenMapper.Deletable<PdDPatientDrugTakenExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientDrugTakenExample
     * @return 结果
     */
    int countByExample(PdDPatientDrugTakenExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientDrugTakenExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientDrugTakenExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientDrugTakenKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientDrugTakenKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientDrugTaken
     * @return 结果
     */
    @Override
    int insert(PdDPatientDrugTaken record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientDrugTaken
     * @return 结果
     */
    int insertSelective(PdDPatientDrugTaken record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientDrugTakenExample
     * @return 结果
     */
    @Override
    List<PdDPatientDrugTaken> selectByExample(PdDPatientDrugTakenExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientDrugTakenKey
     * @return 结果
     */
    PdDPatientDrugTaken selectByPrimaryKey(PdDPatientDrugTakenKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientDrugTaken
     * @param example PdDPatientDrugTakenExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientDrugTaken record, @Param("example") PdDPatientDrugTakenExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientDrugTaken
     * @param example PdDPatientDrugTakenExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientDrugTaken record, @Param("example") PdDPatientDrugTakenExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientDrugTaken
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientDrugTaken record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientDrugTaken
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientDrugTaken record);
}