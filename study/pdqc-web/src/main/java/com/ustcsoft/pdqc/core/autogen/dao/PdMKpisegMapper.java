//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMKpiseg;
import com.ustcsoft.pdqc.core.autogen.entity.PdMKpisegExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMKpisegKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMKpisegMapper.
 */
public interface PdMKpisegMapper extends AutoGenMapper<PdMKpiseg, PdMKpisegExample>, AutoGenMapper.Insertable<PdMKpiseg>, AutoGenMapper.Updatable<PdMKpiseg, PdMKpisegExample>, AutoGenMapper.UpdatableSelective<PdMKpiseg, PdMKpisegExample>, AutoGenMapper.Deletable<PdMKpisegExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMKpisegExample
     * @return 结果
     */
    int countByExample(PdMKpisegExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMKpisegExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMKpisegExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMKpisegKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMKpisegKey key);

    /**
     * 插入数据.
     *
     * @param record PdMKpiseg
     * @return 结果
     */
    @Override
    int insert(PdMKpiseg record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMKpiseg
     * @return 结果
     */
    int insertSelective(PdMKpiseg record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMKpisegExample
     * @return 结果
     */
    @Override
    List<PdMKpiseg> selectByExample(PdMKpisegExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMKpisegKey
     * @return 结果
     */
    PdMKpiseg selectByPrimaryKey(PdMKpisegKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMKpiseg
     * @param example PdMKpisegExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMKpiseg record, @Param("example") PdMKpisegExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMKpiseg
     * @param example PdMKpisegExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMKpiseg record, @Param("example") PdMKpisegExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMKpiseg
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMKpiseg record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMKpiseg
     * @return 结果
     */
    int updateByPrimaryKey(PdMKpiseg record);
}