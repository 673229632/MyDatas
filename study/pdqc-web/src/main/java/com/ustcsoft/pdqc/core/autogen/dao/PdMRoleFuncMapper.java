//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleFunc;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleFuncExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMRoleFuncKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMRoleFuncMapper.
 */
public interface PdMRoleFuncMapper extends AutoGenMapper<PdMRoleFunc, PdMRoleFuncExample>, AutoGenMapper.Insertable<PdMRoleFunc>, AutoGenMapper.Updatable<PdMRoleFunc, PdMRoleFuncExample>, AutoGenMapper.UpdatableSelective<PdMRoleFunc, PdMRoleFuncExample>, AutoGenMapper.Deletable<PdMRoleFuncExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMRoleFuncExample
     * @return 结果
     */
    int countByExample(PdMRoleFuncExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMRoleFuncExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMRoleFuncExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMRoleFuncKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMRoleFuncKey key);

    /**
     * 插入数据.
     *
     * @param record PdMRoleFunc
     * @return 结果
     */
    @Override
    int insert(PdMRoleFunc record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMRoleFunc
     * @return 结果
     */
    int insertSelective(PdMRoleFunc record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMRoleFuncExample
     * @return 结果
     */
    @Override
    List<PdMRoleFunc> selectByExample(PdMRoleFuncExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMRoleFuncKey
     * @return 结果
     */
    PdMRoleFunc selectByPrimaryKey(PdMRoleFuncKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMRoleFunc
     * @param example PdMRoleFuncExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMRoleFunc record, @Param("example") PdMRoleFuncExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMRoleFunc
     * @param example PdMRoleFuncExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMRoleFunc record, @Param("example") PdMRoleFuncExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMRoleFunc
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMRoleFunc record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMRoleFunc
     * @return 结果
     */
    int updateByPrimaryKey(PdMRoleFunc record);
}