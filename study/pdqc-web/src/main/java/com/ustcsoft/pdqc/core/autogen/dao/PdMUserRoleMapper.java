//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserRole;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserRoleExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMUserRoleMapper.
 */
public interface PdMUserRoleMapper extends AutoGenMapper<PdMUserRole, PdMUserRoleExample>, AutoGenMapper.Insertable<PdMUserRole>, AutoGenMapper.Updatable<PdMUserRole, PdMUserRoleExample>, AutoGenMapper.UpdatableSelective<PdMUserRole, PdMUserRoleExample>, AutoGenMapper.Deletable<PdMUserRoleExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMUserRoleExample
     * @return 结果
     */
    int countByExample(PdMUserRoleExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMUserRoleExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMUserRoleExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMUserRoleKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMUserRoleKey key);

    /**
     * 插入数据.
     *
     * @param record PdMUserRole
     * @return 结果
     */
    @Override
    int insert(PdMUserRole record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMUserRole
     * @return 结果
     */
    int insertSelective(PdMUserRole record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMUserRoleExample
     * @return 结果
     */
    @Override
    List<PdMUserRole> selectByExample(PdMUserRoleExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMUserRoleKey
     * @return 结果
     */
    PdMUserRole selectByPrimaryKey(PdMUserRoleKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMUserRole
     * @param example PdMUserRoleExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMUserRole record, @Param("example") PdMUserRoleExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMUserRole
     * @param example PdMUserRoleExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMUserRole record, @Param("example") PdMUserRoleExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMUserRole
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMUserRole record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMUserRole
     * @return 结果
     */
    int updateByPrimaryKey(PdMUserRole record);
}