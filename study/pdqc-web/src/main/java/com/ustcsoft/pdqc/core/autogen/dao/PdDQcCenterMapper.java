//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDQcCenterKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDQcCenterMapper.
 */
public interface PdDQcCenterMapper extends AutoGenMapper<PdDQcCenter, PdDQcCenterExample>, AutoGenMapper.Insertable<PdDQcCenter>, AutoGenMapper.Updatable<PdDQcCenter, PdDQcCenterExample>, AutoGenMapper.UpdatableSelective<PdDQcCenter, PdDQcCenterExample>, AutoGenMapper.Deletable<PdDQcCenterExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDQcCenterExample
     * @return 结果
     */
    int countByExample(PdDQcCenterExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDQcCenterExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDQcCenterExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDQcCenterKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDQcCenterKey key);

    /**
     * 插入数据.
     *
     * @param record PdDQcCenter
     * @return 结果
     */
    @Override
    int insert(PdDQcCenter record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDQcCenter
     * @return 结果
     */
    int insertSelective(PdDQcCenter record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDQcCenterExample
     * @return 结果
     */
    @Override
    List<PdDQcCenter> selectByExample(PdDQcCenterExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDQcCenterKey
     * @return 结果
     */
    PdDQcCenter selectByPrimaryKey(PdDQcCenterKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDQcCenter
     * @param example PdDQcCenterExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDQcCenter record, @Param("example") PdDQcCenterExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDQcCenter
     * @param example PdDQcCenterExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDQcCenter record, @Param("example") PdDQcCenterExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDQcCenter
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDQcCenter record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDQcCenter
     * @return 结果
     */
    int updateByPrimaryKey(PdDQcCenter record);
}