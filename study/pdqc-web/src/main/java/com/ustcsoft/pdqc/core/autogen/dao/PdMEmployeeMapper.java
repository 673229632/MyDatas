//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployee;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeMapper.
 */
public interface PdMEmployeeMapper extends AutoGenMapper<PdMEmployee, PdMEmployeeExample>, AutoGenMapper.Insertable<PdMEmployee>, AutoGenMapper.Updatable<PdMEmployee, PdMEmployeeExample>, AutoGenMapper.UpdatableSelective<PdMEmployee, PdMEmployeeExample>, AutoGenMapper.Deletable<PdMEmployeeExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMEmployeeExample
     * @return 结果
     */
    int countByExample(PdMEmployeeExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMEmployeeExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMEmployeeExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMEmployeeKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMEmployeeKey key);

    /**
     * 插入数据.
     *
     * @param record PdMEmployee
     * @return 结果
     */
    @Override
    int insert(PdMEmployee record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMEmployee
     * @return 结果
     */
    int insertSelective(PdMEmployee record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMEmployeeExample
     * @return 结果
     */
    @Override
    List<PdMEmployee> selectByExample(PdMEmployeeExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMEmployeeKey
     * @return 结果
     */
    PdMEmployee selectByPrimaryKey(PdMEmployeeKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMEmployee
     * @param example PdMEmployeeExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMEmployee record, @Param("example") PdMEmployeeExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMEmployee
     * @param example PdMEmployeeExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMEmployee record, @Param("example") PdMEmployeeExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMEmployee
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMEmployee record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMEmployee
     * @return 结果
     */
    int updateByPrimaryKey(PdMEmployee record);
}