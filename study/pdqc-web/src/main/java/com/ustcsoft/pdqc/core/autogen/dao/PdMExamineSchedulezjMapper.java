//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulezj;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulezjExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulezjKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMExamineSchedulezjMapper.
 */
public interface PdMExamineSchedulezjMapper extends AutoGenMapper<PdMExamineSchedulezj, PdMExamineSchedulezjExample>, AutoGenMapper.Insertable<PdMExamineSchedulezj>, AutoGenMapper.Updatable<PdMExamineSchedulezj, PdMExamineSchedulezjExample>, AutoGenMapper.UpdatableSelective<PdMExamineSchedulezj, PdMExamineSchedulezjExample>, AutoGenMapper.Deletable<PdMExamineSchedulezjExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMExamineSchedulezjExample
     * @return 结果
     */
    int countByExample(PdMExamineSchedulezjExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMExamineSchedulezjExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMExamineSchedulezjExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMExamineSchedulezjKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMExamineSchedulezjKey key);

    /**
     * 插入数据.
     *
     * @param record PdMExamineSchedulezj
     * @return 结果
     */
    @Override
    int insert(PdMExamineSchedulezj record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMExamineSchedulezj
     * @return 结果
     */
    int insertSelective(PdMExamineSchedulezj record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMExamineSchedulezjExample
     * @return 结果
     */
    @Override
    List<PdMExamineSchedulezj> selectByExample(PdMExamineSchedulezjExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMExamineSchedulezjKey
     * @return 结果
     */
    PdMExamineSchedulezj selectByPrimaryKey(PdMExamineSchedulezjKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMExamineSchedulezj
     * @param example PdMExamineSchedulezjExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMExamineSchedulezj record, @Param("example") PdMExamineSchedulezjExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMExamineSchedulezj
     * @param example PdMExamineSchedulezjExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMExamineSchedulezj record, @Param("example") PdMExamineSchedulezjExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMExamineSchedulezj
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMExamineSchedulezj record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMExamineSchedulezj
     * @return 结果
     */
    int updateByPrimaryKey(PdMExamineSchedulezj record);
}