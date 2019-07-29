//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCode;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCodeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMCodeMapper.
 */
public interface PdMCodeMapper extends AutoGenMapper<PdMCode, PdMCodeExample>, AutoGenMapper.Insertable<PdMCode>, AutoGenMapper.Updatable<PdMCode, PdMCodeExample>, AutoGenMapper.UpdatableSelective<PdMCode, PdMCodeExample>, AutoGenMapper.Deletable<PdMCodeExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMCodeExample
     * @return 结果
     */
    int countByExample(PdMCodeExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMCodeExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMCodeExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMCodeKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMCodeKey key);

    /**
     * 插入数据.
     *
     * @param record PdMCode
     * @return 结果
     */
    @Override
    int insert(PdMCode record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMCode
     * @return 结果
     */
    int insertSelective(PdMCode record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMCodeExample
     * @return 结果
     */
    @Override
    List<PdMCode> selectByExample(PdMCodeExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMCodeKey
     * @return 结果
     */
    PdMCode selectByPrimaryKey(PdMCodeKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMCode
     * @param example PdMCodeExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMCode record, @Param("example") PdMCodeExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMCode
     * @param example PdMCodeExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMCode record, @Param("example") PdMCodeExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMCode
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMCode record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMCode
     * @return 结果
     */
    int updateByPrimaryKey(PdMCode record);
}