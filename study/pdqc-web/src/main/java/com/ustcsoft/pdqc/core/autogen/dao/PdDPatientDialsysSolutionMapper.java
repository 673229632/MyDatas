//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialsysSolution;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialsysSolutionExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialsysSolutionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDialsysSolutionMapper.
 */
public interface PdDPatientDialsysSolutionMapper extends AutoGenMapper<PdDPatientDialsysSolution, PdDPatientDialsysSolutionExample>, AutoGenMapper.Insertable<PdDPatientDialsysSolution>, AutoGenMapper.Updatable<PdDPatientDialsysSolution, PdDPatientDialsysSolutionExample>, AutoGenMapper.UpdatableSelective<PdDPatientDialsysSolution, PdDPatientDialsysSolutionExample>, AutoGenMapper.Deletable<PdDPatientDialsysSolutionExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientDialsysSolutionExample
     * @return 结果
     */
    int countByExample(PdDPatientDialsysSolutionExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientDialsysSolutionExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientDialsysSolutionExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientDialsysSolutionKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientDialsysSolutionKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientDialsysSolution
     * @return 结果
     */
    @Override
    int insert(PdDPatientDialsysSolution record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientDialsysSolution
     * @return 结果
     */
    int insertSelective(PdDPatientDialsysSolution record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientDialsysSolutionExample
     * @return 结果
     */
    @Override
    List<PdDPatientDialsysSolution> selectByExample(PdDPatientDialsysSolutionExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientDialsysSolutionKey
     * @return 结果
     */
    PdDPatientDialsysSolution selectByPrimaryKey(PdDPatientDialsysSolutionKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientDialsysSolution
     * @param example PdDPatientDialsysSolutionExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientDialsysSolution record, @Param("example") PdDPatientDialsysSolutionExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientDialsysSolution
     * @param example PdDPatientDialsysSolutionExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientDialsysSolution record, @Param("example") PdDPatientDialsysSolutionExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientDialsysSolution
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientDialsysSolution record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientDialsysSolution
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientDialsysSolution record);
}