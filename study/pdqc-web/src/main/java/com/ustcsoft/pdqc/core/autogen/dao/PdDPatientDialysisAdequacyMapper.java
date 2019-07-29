//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialysisAdequacy;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialysisAdequacyExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientDialysisAdequacyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientDialysisAdequacyMapper.
 */
public interface PdDPatientDialysisAdequacyMapper extends AutoGenMapper<PdDPatientDialysisAdequacy, PdDPatientDialysisAdequacyExample>, AutoGenMapper.Insertable<PdDPatientDialysisAdequacy>, AutoGenMapper.Updatable<PdDPatientDialysisAdequacy, PdDPatientDialysisAdequacyExample>, AutoGenMapper.UpdatableSelective<PdDPatientDialysisAdequacy, PdDPatientDialysisAdequacyExample>, AutoGenMapper.Deletable<PdDPatientDialysisAdequacyExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientDialysisAdequacyExample
     * @return 结果
     */
    int countByExample(PdDPatientDialysisAdequacyExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientDialysisAdequacyExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientDialysisAdequacyExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientDialysisAdequacyKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientDialysisAdequacyKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientDialysisAdequacy
     * @return 结果
     */
    @Override
    int insert(PdDPatientDialysisAdequacy record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientDialysisAdequacy
     * @return 结果
     */
    int insertSelective(PdDPatientDialysisAdequacy record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientDialysisAdequacyExample
     * @return 结果
     */
    @Override
    List<PdDPatientDialysisAdequacy> selectByExample(PdDPatientDialysisAdequacyExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientDialysisAdequacyKey
     * @return 结果
     */
    PdDPatientDialysisAdequacy selectByPrimaryKey(PdDPatientDialysisAdequacyKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientDialysisAdequacy
     * @param example PdDPatientDialysisAdequacyExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientDialysisAdequacy record, @Param("example") PdDPatientDialysisAdequacyExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientDialysisAdequacy
     * @param example PdDPatientDialysisAdequacyExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientDialysisAdequacy record, @Param("example") PdDPatientDialysisAdequacyExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientDialysisAdequacy
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientDialysisAdequacy record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientDialysisAdequacy
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientDialysisAdequacy record);
}