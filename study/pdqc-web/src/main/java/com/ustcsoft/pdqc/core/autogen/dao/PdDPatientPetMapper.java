//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientPet;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientPetExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientPetKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientPetMapper.
 */
public interface PdDPatientPetMapper extends AutoGenMapper<PdDPatientPet, PdDPatientPetExample>, AutoGenMapper.Insertable<PdDPatientPet>, AutoGenMapper.Updatable<PdDPatientPet, PdDPatientPetExample>, AutoGenMapper.UpdatableSelective<PdDPatientPet, PdDPatientPetExample>, AutoGenMapper.Deletable<PdDPatientPetExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientPetExample
     * @return 结果
     */
    int countByExample(PdDPatientPetExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientPetExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientPetExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientPetKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientPetKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientPet
     * @return 结果
     */
    @Override
    int insert(PdDPatientPet record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientPet
     * @return 结果
     */
    int insertSelective(PdDPatientPet record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientPetExample
     * @return 结果
     */
    @Override
    List<PdDPatientPet> selectByExample(PdDPatientPetExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientPetKey
     * @return 结果
     */
    PdDPatientPet selectByPrimaryKey(PdDPatientPetKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientPet
     * @param example PdDPatientPetExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientPet record, @Param("example") PdDPatientPetExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientPet
     * @param example PdDPatientPetExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientPet record, @Param("example") PdDPatientPetExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientPet
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientPet record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientPet
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientPet record);
}