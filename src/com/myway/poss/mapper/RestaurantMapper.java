package com.myway.poss.mapper;

import com.myway.poss.pojo.Restaurant;
import com.myway.poss.pojo.RestaurantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RestaurantMapper {
    int countByExample(RestaurantExample example);

    int deleteByExample(RestaurantExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    List<Restaurant> selectByExampleWithBLOBs(RestaurantExample example);

    List<Restaurant> selectByExample(RestaurantExample example);

    Restaurant selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByExampleWithBLOBs(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByExample(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKeyWithBLOBs(Restaurant record);

    int updateByPrimaryKey(Restaurant record);
}