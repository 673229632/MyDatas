//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMTitleEmployee;
import com.ustcsoft.pdqc.core.autogen.entity.PdMTitleEmployeeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMTitleEmployeeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMTitleEmployeeMapper.
 */
public interface PdMTitleEmployeeMapper extends AutoGenMapper<PdMTitleEmployee, PdMTitleEmployeeExample>, AutoGenMapper.Insertable<PdMTitleEmployee>, AutoGenMapper.Updatable<PdMTitleEmployee, PdMTitleEmployeeExample>, AutoGenMapper.UpdatableSelective<PdMTitleEmployee, PdMTitleEmployeeExample>, AutoGenMapper.Deletable<PdMTitleEmployeeExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMTitleEmployeeExample
     * @return 结果
     */
    int countByExample(PdMTitleEmployeeExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMTitleEmployeeExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMTitleEmployeeExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMTitleEmployeeKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMTitleEmployeeKey key);

    /**
     * 插入数据.
     *
     * @param record PdMTitleEmployee
     * @return 结果
     */
    @Override
    int insert(PdMTitleEmployee record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMTitleEmployee
     * @return 结果
     */
    int insertSelective(PdMTitleEmployee record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMTitleEmployeeExample
     * @return 结果
     */
    @Override
    List<PdMTitleEmployee> selectByExample(PdMTitleEmployeeExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMTitleEmployeeKey
     * @return 结果
     */
    PdMTitleEmployee selectByPrimaryKey(PdMTitleEmployeeKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMTitleEmployee
     * @param example PdMTitleEmployeeExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMTitleEmployee record, @Param("example") PdMTitleEmployeeExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMTitleEmployee
     * @param example PdMTitleEmployeeExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMTitleEmployee record, @Param("example") PdMTitleEmployeeExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMTitleEmployee
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMTitleEmployee record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMTitleEmployee
     * @return 结果
     */
    int updateByPrimaryKey(PdMTitleEmployee record);
}