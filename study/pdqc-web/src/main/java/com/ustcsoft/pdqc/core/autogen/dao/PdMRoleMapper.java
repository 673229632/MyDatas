//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRole;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMRoleMapper.
 */
public interface PdMRoleMapper extends AutoGenMapper<PdMRole, PdMRoleExample>, AutoGenMapper.Insertable<PdMRole>, AutoGenMapper.Updatable<PdMRole, PdMRoleExample>, AutoGenMapper.UpdatableSelective<PdMRole, PdMRoleExample>, AutoGenMapper.Deletable<PdMRoleExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMRoleExample
     * @return 结果
     */
    int countByExample(PdMRoleExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMRoleExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMRoleExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMRoleKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMRoleKey key);

    /**
     * 插入数据.
     *
     * @param record PdMRole
     * @return 结果
     */
    @Override
    int insert(PdMRole record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMRole
     * @return 结果
     */
    int insertSelective(PdMRole record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMRoleExample
     * @return 结果
     */
    @Override
    List<PdMRole> selectByExample(PdMRoleExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMRoleKey
     * @return 结果
     */
    PdMRole selectByPrimaryKey(PdMRoleKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMRole
     * @param example PdMRoleExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMRole record, @Param("example") PdMRoleExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMRole
     * @param example PdMRoleExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMRole record, @Param("example") PdMRoleExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMRole
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMRole record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMRole
     * @return 结果
     */
    int updateByPrimaryKey(PdMRole record);
}