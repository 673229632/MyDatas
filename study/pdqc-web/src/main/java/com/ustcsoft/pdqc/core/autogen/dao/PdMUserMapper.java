//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUser;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMUserMapper.
 */
public interface PdMUserMapper extends AutoGenMapper<PdMUser, PdMUserExample>, AutoGenMapper.Insertable<PdMUser>, AutoGenMapper.Updatable<PdMUser, PdMUserExample>, AutoGenMapper.UpdatableSelective<PdMUser, PdMUserExample>, AutoGenMapper.Deletable<PdMUserExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMUserExample
     * @return 结果
     */
    int countByExample(PdMUserExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMUserExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMUserExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMUserKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMUserKey key);

    /**
     * 插入数据.
     *
     * @param record PdMUser
     * @return 结果
     */
    @Override
    int insert(PdMUser record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMUser
     * @return 结果
     */
    int insertSelective(PdMUser record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMUserExample
     * @return 结果
     */
    @Override
    List<PdMUser> selectByExample(PdMUserExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMUserKey
     * @return 结果
     */
    PdMUser selectByPrimaryKey(PdMUserKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMUser
     * @param example PdMUserExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMUser record, @Param("example") PdMUserExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMUser
     * @param example PdMUserExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMUser record, @Param("example") PdMUserExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMUser
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMUser record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMUser
     * @return 结果
     */
    int updateByPrimaryKey(PdMUser record);
}