//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfo;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfoExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientInfoMapper.
 */
public interface PdDPatientInfoMapper extends AutoGenMapper<PdDPatientInfo, PdDPatientInfoExample>, AutoGenMapper.Insertable<PdDPatientInfo>, AutoGenMapper.Updatable<PdDPatientInfo, PdDPatientInfoExample>, AutoGenMapper.UpdatableSelective<PdDPatientInfo, PdDPatientInfoExample>, AutoGenMapper.Deletable<PdDPatientInfoExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientInfoExample
     * @return 结果
     */
    int countByExample(PdDPatientInfoExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientInfoExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientInfoExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientInfoKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientInfoKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientInfo
     * @return 结果
     */
    @Override
    int insert(PdDPatientInfo record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientInfo
     * @return 结果
     */
    int insertSelective(PdDPatientInfo record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientInfoExample
     * @return 结果
     */
    @Override
    List<PdDPatientInfo> selectByExample(PdDPatientInfoExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientInfoKey
     * @return 结果
     */
    PdDPatientInfo selectByPrimaryKey(PdDPatientInfoKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInfo
     * @param example PdDPatientInfoExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientInfo record, @Param("example") PdDPatientInfoExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientInfo
     * @param example PdDPatientInfoExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientInfo record, @Param("example") PdDPatientInfoExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientInfo
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientInfo record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientInfo
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientInfo record);
}