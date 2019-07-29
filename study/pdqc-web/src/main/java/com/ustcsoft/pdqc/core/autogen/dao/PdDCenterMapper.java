//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenter;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDCenterKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDCenterMapper.
 */
public interface PdDCenterMapper extends AutoGenMapper<PdDCenter, PdDCenterExample>, AutoGenMapper.Insertable<PdDCenter>, AutoGenMapper.Updatable<PdDCenter, PdDCenterExample>, AutoGenMapper.UpdatableSelective<PdDCenter, PdDCenterExample>, AutoGenMapper.Deletable<PdDCenterExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDCenterExample
     * @return 结果
     */
    int countByExample(PdDCenterExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDCenterExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDCenterExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDCenterKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDCenterKey key);

    /**
     * 插入数据.
     *
     * @param record PdDCenter
     * @return 结果
     */
    @Override
    int insert(PdDCenter record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDCenter
     * @return 结果
     */
    int insertSelective(PdDCenter record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDCenterExample
     * @return 结果
     */
    @Override
    List<PdDCenter> selectByExample(PdDCenterExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDCenterKey
     * @return 结果
     */
    PdDCenter selectByPrimaryKey(PdDCenterKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDCenter
     * @param example PdDCenterExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDCenter record, @Param("example") PdDCenterExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDCenter
     * @param example PdDCenterExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDCenter record, @Param("example") PdDCenterExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDCenter
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDCenter record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDCenter
     * @return 结果
     */
    int updateByPrimaryKey(PdDCenter record);
}