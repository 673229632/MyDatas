//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganization;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMOrganizationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMOrganizationMapper.
 */
public interface PdMOrganizationMapper extends AutoGenMapper<PdMOrganization, PdMOrganizationExample>, AutoGenMapper.Insertable<PdMOrganization>, AutoGenMapper.Updatable<PdMOrganization, PdMOrganizationExample>, AutoGenMapper.UpdatableSelective<PdMOrganization, PdMOrganizationExample>, AutoGenMapper.Deletable<PdMOrganizationExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMOrganizationExample
     * @return 结果
     */
    int countByExample(PdMOrganizationExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMOrganizationExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMOrganizationExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMOrganizationKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMOrganizationKey key);

    /**
     * 插入数据.
     *
     * @param record PdMOrganization
     * @return 结果
     */
    @Override
    int insert(PdMOrganization record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMOrganization
     * @return 结果
     */
    int insertSelective(PdMOrganization record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMOrganizationExample
     * @return 结果
     */
    @Override
    List<PdMOrganization> selectByExample(PdMOrganizationExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMOrganizationKey
     * @return 结果
     */
    PdMOrganization selectByPrimaryKey(PdMOrganizationKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMOrganization
     * @param example PdMOrganizationExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMOrganization record, @Param("example") PdMOrganizationExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMOrganization
     * @param example PdMOrganizationExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMOrganization record, @Param("example") PdMOrganizationExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMOrganization
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMOrganization record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMOrganization
     * @return 结果
     */
    int updateByPrimaryKey(PdMOrganization record);
}