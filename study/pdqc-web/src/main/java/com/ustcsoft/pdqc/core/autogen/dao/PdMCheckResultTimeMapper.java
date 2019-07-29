//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckResultTime;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckResultTimeExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMCheckResultTimeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMCheckResultTimeMapper.
 */
public interface PdMCheckResultTimeMapper extends AutoGenMapper<PdMCheckResultTime, PdMCheckResultTimeExample>, AutoGenMapper.Insertable<PdMCheckResultTime>, AutoGenMapper.Updatable<PdMCheckResultTime, PdMCheckResultTimeExample>, AutoGenMapper.UpdatableSelective<PdMCheckResultTime, PdMCheckResultTimeExample>, AutoGenMapper.Deletable<PdMCheckResultTimeExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMCheckResultTimeExample
     * @return 结果
     */
    int countByExample(PdMCheckResultTimeExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMCheckResultTimeExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMCheckResultTimeExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMCheckResultTimeKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMCheckResultTimeKey key);

    /**
     * 插入数据.
     *
     * @param record PdMCheckResultTime
     * @return 结果
     */
    @Override
    int insert(PdMCheckResultTime record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMCheckResultTime
     * @return 结果
     */
    int insertSelective(PdMCheckResultTime record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMCheckResultTimeExample
     * @return 结果
     */
    @Override
    List<PdMCheckResultTime> selectByExample(PdMCheckResultTimeExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMCheckResultTimeKey
     * @return 结果
     */
    PdMCheckResultTime selectByPrimaryKey(PdMCheckResultTimeKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMCheckResultTime
     * @param example PdMCheckResultTimeExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMCheckResultTime record, @Param("example") PdMCheckResultTimeExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMCheckResultTime
     * @param example PdMCheckResultTimeExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMCheckResultTime record, @Param("example") PdMCheckResultTimeExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMCheckResultTime
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMCheckResultTime record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMCheckResultTime
     * @return 结果
     */
    int updateByPrimaryKey(PdMCheckResultTime record);
}