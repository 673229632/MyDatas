//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMFiletype;
import com.ustcsoft.pdqc.core.autogen.entity.PdMFiletypeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMFiletypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMFiletypeMapper.
 */
public interface PdMFiletypeMapper extends AutoGenMapper<PdMFiletype, PdMFiletypeExample>, AutoGenMapper.Insertable<PdMFiletype>, AutoGenMapper.Updatable<PdMFiletype, PdMFiletypeExample>, AutoGenMapper.UpdatableSelective<PdMFiletype, PdMFiletypeExample>, AutoGenMapper.Deletable<PdMFiletypeExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMFiletypeExample
     * @return 结果
     */
    int countByExample(PdMFiletypeExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMFiletypeExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMFiletypeExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMFiletypeKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMFiletypeKey key);

    /**
     * 插入数据.
     *
     * @param record PdMFiletype
     * @return 结果
     */
    @Override
    int insert(PdMFiletype record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMFiletype
     * @return 结果
     */
    int insertSelective(PdMFiletype record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMFiletypeExample
     * @return 结果
     */
    @Override
    List<PdMFiletype> selectByExample(PdMFiletypeExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMFiletypeKey
     * @return 结果
     */
    PdMFiletype selectByPrimaryKey(PdMFiletypeKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMFiletype
     * @param example PdMFiletypeExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMFiletype record, @Param("example") PdMFiletypeExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMFiletype
     * @param example PdMFiletypeExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMFiletype record, @Param("example") PdMFiletypeExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMFiletype
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMFiletype record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMFiletype
     * @return 结果
     */
    int updateByPrimaryKey(PdMFiletype record);
}