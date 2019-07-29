//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCode;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCodeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PSysCodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PSysCodeMapper.
 */
public interface PSysCodeMapper extends AutoGenMapper<PSysCode, PSysCodeExample>, AutoGenMapper.Insertable<PSysCode>, AutoGenMapper.Updatable<PSysCode, PSysCodeExample>, AutoGenMapper.UpdatableSelective<PSysCode, PSysCodeExample>, AutoGenMapper.Deletable<PSysCodeExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PSysCodeExample
     * @return 结果
     */
    int countByExample(PSysCodeExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PSysCodeExample
     * @return 结果
     */
    @Override
    int deleteByExample(PSysCodeExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PSysCodeKey
     * @return 结果
     */
    int deleteByPrimaryKey(PSysCodeKey key);

    /**
     * 插入数据.
     *
     * @param record PSysCode
     * @return 结果
     */
    @Override
    int insert(PSysCode record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PSysCode
     * @return 结果
     */
    int insertSelective(PSysCode record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PSysCodeExample
     * @return 结果
     */
    @Override
    List<PSysCode> selectByExample(PSysCodeExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PSysCodeKey
     * @return 结果
     */
    PSysCode selectByPrimaryKey(PSysCodeKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PSysCode
     * @param example PSysCodeExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PSysCode record, @Param("example") PSysCodeExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PSysCode
     * @param example PSysCodeExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PSysCode record, @Param("example") PSysCodeExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PSysCode
     * @return 结果
     */
    int updateByPrimaryKeySelective(PSysCode record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PSysCode
     * @return 结果
     */
    int updateByPrimaryKey(PSysCode record);
}