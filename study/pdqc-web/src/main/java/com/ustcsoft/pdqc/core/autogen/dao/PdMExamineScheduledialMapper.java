//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineScheduledial;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineScheduledialExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineScheduledialKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMExamineScheduledialMapper.
 */
public interface PdMExamineScheduledialMapper extends AutoGenMapper<PdMExamineScheduledial, PdMExamineScheduledialExample>, AutoGenMapper.Insertable<PdMExamineScheduledial>, AutoGenMapper.Updatable<PdMExamineScheduledial, PdMExamineScheduledialExample>, AutoGenMapper.UpdatableSelective<PdMExamineScheduledial, PdMExamineScheduledialExample>, AutoGenMapper.Deletable<PdMExamineScheduledialExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMExamineScheduledialExample
     * @return 结果
     */
    int countByExample(PdMExamineScheduledialExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMExamineScheduledialExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMExamineScheduledialExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMExamineScheduledialKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMExamineScheduledialKey key);

    /**
     * 插入数据.
     *
     * @param record PdMExamineScheduledial
     * @return 结果
     */
    @Override
    int insert(PdMExamineScheduledial record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMExamineScheduledial
     * @return 结果
     */
    int insertSelective(PdMExamineScheduledial record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMExamineScheduledialExample
     * @return 结果
     */
    @Override
    List<PdMExamineScheduledial> selectByExample(PdMExamineScheduledialExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMExamineScheduledialKey
     * @return 结果
     */
    PdMExamineScheduledial selectByPrimaryKey(PdMExamineScheduledialKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMExamineScheduledial
     * @param example PdMExamineScheduledialExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMExamineScheduledial record, @Param("example") PdMExamineScheduledialExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMExamineScheduledial
     * @param example PdMExamineScheduledialExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMExamineScheduledial record, @Param("example") PdMExamineScheduledialExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMExamineScheduledial
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMExamineScheduledial record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMExamineScheduledial
     * @return 结果
     */
    int updateByPrimaryKey(PdMExamineScheduledial record);
}