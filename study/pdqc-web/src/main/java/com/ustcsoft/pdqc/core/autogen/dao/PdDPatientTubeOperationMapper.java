//******************************************************************************
// 版权所有(c) 2018，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package com.ustcsoft.pdqc.core.autogen.dao;

import com.ustcsoft.mybatis.autogen.mapper.AutoGenMapper;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientTubeOperation;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientTubeOperationExample;
import com.ustcsoft.pdqc.core.autogen.entity.PdDPatientTubeOperationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * com.ustcsoft.pdqc.core.autogen.dao.PdDPatientTubeOperationMapper.
 */
public interface PdDPatientTubeOperationMapper extends AutoGenMapper<PdDPatientTubeOperation, PdDPatientTubeOperationExample>, AutoGenMapper.Insertable<PdDPatientTubeOperation>, AutoGenMapper.Updatable<PdDPatientTubeOperation, PdDPatientTubeOperationExample>, AutoGenMapper.UpdatableSelective<PdDPatientTubeOperation, PdDPatientTubeOperationExample>, AutoGenMapper.Deletable<PdDPatientTubeOperationExample> {
    /**
     * 根据Example条件查询件数.
     *
     * @param example PdDPatientTubeOperationExample
     * @return 结果
     */
    int countByExample(PdDPatientTubeOperationExample example);

    /**
     * 根据Example条件删除数据.
     *
     * @param example PdDPatientTubeOperationExample
     * @return 结果
     */
    @Override
    int deleteByExample(PdDPatientTubeOperationExample example);

    /**
     * 根据主键删除数据.
     *
     * @param key PdDPatientTubeOperationKey
     * @return 结果
     */
    int deleteByPrimaryKey(PdDPatientTubeOperationKey key);

    /**
     * 插入数据.
     *
     * @param record PdDPatientTubeOperation
     * @return 结果
     */
    @Override
    int insert(PdDPatientTubeOperation record);

    /**
     * 插入数据（仅仅插入已设值项目）.
     *
     * @param record PdDPatientTubeOperation
     * @return 结果
     */
    int insertSelective(PdDPatientTubeOperation record);

    /**
     * 根据Example条件查询数据.
     *
     * @param example PdDPatientTubeOperationExample
     * @return 结果
     */
    @Override
    List<PdDPatientTubeOperation> selectByExample(PdDPatientTubeOperationExample example);

    /**
     * 根据主键获取一条数据.
     *
     * @param key PdDPatientTubeOperationKey
     * @return 结果
     */
    PdDPatientTubeOperation selectByPrimaryKey(PdDPatientTubeOperationKey key);

    /**
     * 根据Example条件来更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientTubeOperation
     * @param example PdDPatientTubeOperationExample
     * @return 结果
     */
    int updateByExampleSelective(@Param("record") PdDPatientTubeOperation record, @Param("example") PdDPatientTubeOperationExample example);

    /**
     * 根据Example条件来更新数据.
     *
     * @param record PdDPatientTubeOperation
     * @param example PdDPatientTubeOperationExample
     * @return 结果
     */
    @Override
    int updateByExample(@Param("record") PdDPatientTubeOperation record, @Param("example") PdDPatientTubeOperationExample example);

    /**
     * 根据主键更新数据（仅仅更新已设值项目）.
     *
     * @param record PdDPatientTubeOperation
     * @return 结果
     */
    int updateByPrimaryKeySelective(PdDPatientTubeOperation record);

    /**
     * 根据主键来更新数据库记录.
     *
     * @param record PdDPatientTubeOperation
     * @return 结果
     */
    int updateByPrimaryKey(PdDPatientTubeOperation record);
}