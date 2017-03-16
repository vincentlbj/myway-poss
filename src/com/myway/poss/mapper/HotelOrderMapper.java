package com.myway.poss.mapper;

import com.myway.poss.pojo.HotelOrder;
import com.myway.poss.pojo.HotelOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelOrderMapper {
    int countByExample(HotelOrderExample example);

    int deleteByExample(HotelOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotelOrder record);

    int insertSelective(HotelOrder record);

    List<HotelOrder> selectByExample(HotelOrderExample example);

    HotelOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotelOrder record, @Param("example") HotelOrderExample example);

    int updateByExample(@Param("record") HotelOrder record, @Param("example") HotelOrderExample example);

    int updateByPrimaryKeySelective(HotelOrder record);

    int updateByPrimaryKey(HotelOrder record);
}