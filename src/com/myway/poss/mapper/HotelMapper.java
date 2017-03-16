package com.myway.poss.mapper;

import com.myway.poss.pojo.Hotel;
import com.myway.poss.pojo.HotelExample;
import com.myway.poss.pojo.HotelWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelMapper {
    int countByExample(HotelExample example);

    int deleteByExample(HotelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotelWithBLOBs record);

    int insertSelective(HotelWithBLOBs record);

    List<HotelWithBLOBs> selectByExampleWithBLOBs(HotelExample example);

    List<Hotel> selectByExample(HotelExample example);

    HotelWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotelWithBLOBs record, @Param("example") HotelExample example);

    int updateByExampleWithBLOBs(@Param("record") HotelWithBLOBs record, @Param("example") HotelExample example);

    int updateByExample(@Param("record") Hotel record, @Param("example") HotelExample example);

    int updateByPrimaryKeySelective(HotelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HotelWithBLOBs record);

    int updateByPrimaryKey(Hotel record);
}