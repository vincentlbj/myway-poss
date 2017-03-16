package com.myway.poss.mapper;

import com.myway.poss.pojo.TourOrder;
import com.myway.poss.pojo.TourOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TourOrderMapper {
    int countByExample(TourOrderExample example);

    int deleteByExample(TourOrderExample example);

    int deleteByPrimaryKey(Integer oId);

    int insert(TourOrder record);

    int insertSelective(TourOrder record);

    List<TourOrder> selectByExample(TourOrderExample example);

    TourOrder selectByPrimaryKey(Integer oId);

    int updateByExampleSelective(@Param("record") TourOrder record, @Param("example") TourOrderExample example);

    int updateByExample(@Param("record") TourOrder record, @Param("example") TourOrderExample example);

    int updateByPrimaryKeySelective(TourOrder record);

    int updateByPrimaryKey(TourOrder record);
}