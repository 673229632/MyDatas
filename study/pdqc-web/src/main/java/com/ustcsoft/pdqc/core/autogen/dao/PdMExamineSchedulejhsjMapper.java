//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulejhsj;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulejhsjExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdMExamineSchedulejhsjKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdMExamineSchedulejhsjMapper.
 */
public interface PdMExamineSchedulejhsjMapper extends AutoGenMapper<PdMExamineSchedulejhsj, PdMExamineSchedulejhsjExample>, AutoGenMapper.Insertable<PdMExamineSchedulejhsj>, AutoGenMapper.Updatable<PdMExamineSchedulejhsj, PdMExamineSchedulejhsjExample>, AutoGenMapper.UpdatableSelective<PdMExamineSchedulejhsj, PdMExamineSchedulejhsjExample>, AutoGenMapper.Deletable<PdMExamineSchedulejhsjExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdMExamineSchedulejhsjExample
     * @return 结果
     */
    int countByExample(PdMExamineSchedulejhsjExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdMExamineSchedulejhsjExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdMExamineSchedulejhsjExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdMExamineSchedulejhsjKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdMExamineSchedulejhsjKey key);

    /**
     * 插入数据.
     *
     * @param record PdMExamineSchedulejhsj
     * @return 结果
     */
    @Override
    int insert(PdMExamineSchedulejhsj record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdMExamineSchedulejhsj
     * @return 结果
     */
    int insertSelective(PdMExamineSchedulejhsj record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdMExamineSchedulejhsjExample
     * @return 结果
     */
    @Override
    List<PdMExamineSchedulejhsj> selectByExample(PdMExamineSchedulejhsjExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdMExamineSchedulejhsjKey
     * @return 结果
     */
    PdMExamineSchedulejhsj selectByPrimaryKey(PdMExamineSchedulejhsjKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMExamineSchedulejhsj
     * @param example PdMExamineSchedulejhsjExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdMExamineSchedulejhsj record, @Param("example") PdMExamineSchedulejhsjExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdMExamineSchedulejhsj
     * @param example PdMExamineSchedulejhsjExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdMExamineSchedulejhsj record, @Param("example") PdMExamineSchedulejhsjExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdMExamineSchedulejhsj
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdMExamineSchedulejhsj record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdMExamineSchedulejhsj
     * @return 结果
     */
    int updateByPrimaryKey(PdMExamineSchedulejhsj record);
}