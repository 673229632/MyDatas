//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.MTitle;
import com.ustcsoft.pdqc.core.autogen.entity.MTitleExample;
import com.ustcsoft.pdqc.core.autogen.entity.MTitleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.MTitleMapper.
 */
public interface MTitleMapper extends AutoGenMapper<MTitle, MTitleExample>, AutoGenMapper.Insertable<MTitle>, AutoGenMapper.Updatable<MTitle, MTitleExample>, AutoGenMapper.UpdatableSelective<MTitle, MTitleExample>, AutoGenMapper.Deletable<MTitleExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example MTitleExample
     * @return 结果
     */
    int countByExample(MTitleExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example MTitleExample
     * @return 结果
     */
    @Override
    int deleteByExample(MTitleExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key MTitleKey
     * @return 结果
     */
    int deleteByPrimaryKey(MTitleKey key);

    /**
     * 插入数据.
     *
     * @param record MTitle
     * @return 结果
     */
    @Override
    int insert(MTitle record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record MTitle
     * @return 结果
     */
    int insertSelective(MTitle record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example MTitleExample
     * @return 结果
     */
    @Override
    List<MTitle> selectByExample(MTitleExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key MTitleKey
     * @return 结果
     */
    MTitle selectByPrimaryKey(MTitleKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record MTitle
     * @param example MTitleExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") MTitle record, @Param("example") MTitleExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record MTitle
     * @param example MTitleExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") MTitle record, @Param("example") MTitleExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record MTitle
     * @return 结果
     */
    int updateByPrimaryKeySelective(MTitle record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record MTitle
     * @return 结果
     */
    int updateByPrimaryKey(MTitle record);
}