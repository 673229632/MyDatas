//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeUserExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMEmployeeUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMEmployeeUserMapper.
 */
public interface PdMEmployeeUserMapper extends AutoGenMapper<PdMEmployeeUser, PdMEmployeeUserExample>, AutoGenMapper.Insertable<PdMEmployeeUser>, AutoGenMapper.Updatable<PdMEmployeeUser, PdMEmployeeUserExample>, AutoGenMapper.UpdatableSelective<PdMEmployeeUser, PdMEmployeeUserExample>, AutoGenMapper.Deletable<PdMEmployeeUserExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMEmployeeUserExample
     * @return 结果
     */
    int countByExample(PdMEmployeeUserExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMEmployeeUserExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMEmployeeUserExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMEmployeeUserKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMEmployeeUserKey key);

    /**
     * 插入数据.
     *
     * @param record PdMEmployeeUser
     * @return 结果
     */
    @Override
    int insert(PdMEmployeeUser record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMEmployeeUser
     * @return 结果
     */
    int insertSelective(PdMEmployeeUser record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMEmployeeUserExample
     * @return 结果
     */
    @Override
    List<PdMEmployeeUser> selectByExample(PdMEmployeeUserExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMEmployeeUserKey
     * @return 结果
     */
    PdMEmployeeUser selectByPrimaryKey(PdMEmployeeUserKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMEmployeeUser
     * @param example PdMEmployeeUserExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMEmployeeUser record, @Param("example") PdMEmployeeUserExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMEmployeeUser
     * @param example PdMEmployeeUserExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMEmployeeUser record, @Param("example") PdMEmployeeUserExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMEmployeeUser
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMEmployeeUser record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMEmployeeUser
     * @return 结果
     */
    int updateByPrimaryKey(PdMEmployeeUser record);
}