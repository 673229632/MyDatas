//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientComplication;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientComplicationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientComplicationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientComplicationMapper.
 */
public interface PdDPatientComplicationMapper extends AutoGenMapper<PdDPatientComplication, PdDPatientComplicationExample>, AutoGenMapper.Insertable<PdDPatientComplication>, AutoGenMapper.Updatable<PdDPatientComplication, PdDPatientComplicationExample>, AutoGenMapper.UpdatableSelective<PdDPatientComplication, PdDPatientComplicationExample>, AutoGenMapper.Deletable<PdDPatientComplicationExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientComplicationExample
     * @return 结果
     */
    int countByExample(PdDPatientComplicationExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientComplicationExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientComplicationExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientComplicationKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientComplicationKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientComplication
     * @return 结果
     */
    @Override
    int insert(PdDPatientComplication record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientComplication
     * @return 结果
     */
    int insertSelective(PdDPatientComplication record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientComplicationExample
     * @return 结果
     */
    @Override
    List<PdDPatientComplication> selectByExample(PdDPatientComplicationExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientComplicationKey
     * @return 结果
     */
    PdDPatientComplication selectByPrimaryKey(PdDPatientComplicationKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientComplication
     * @param example PdDPatientComplicationExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientComplication record, @Param("example") PdDPatientComplicationExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientComplication
     * @param example PdDPatientComplicationExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientComplication record, @Param("example") PdDPatientComplicationExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientComplication
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientComplication record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientComplication
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientComplication record);
}