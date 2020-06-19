package com.xuanke.mapping;

import com.xuanke.entity.Estimate;
import com.xuanke.entity.EstimateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EstimateMapper {
    long countByExample(EstimateExample example);

    int deleteByExample(EstimateExample example);

    int deleteByPrimaryKey(String pId);

    int insert(Estimate record);

    int insertSelective(Estimate record);

    List<Estimate> selectByExample(EstimateExample example);

    Estimate selectByPrimaryKey(Integer pId);

//    新加的
//    List<Estimate> selectByCid(String cid);

    int updateByExampleSelective(@Param("record") Estimate record, @Param("example") EstimateExample example);

    int updateByExample(@Param("record") Estimate record, @Param("example") EstimateExample example);

    int updateByPrimaryKeySelective(Estimate record);

    int updateByPrimaryKey(Estimate record);
}