package com.myway.poss.mapper;

import com.myway.poss.pojo.Tour;
import com.myway.poss.pojo.TourExample;
import com.myway.poss.pojo.TourWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TourMapper {
    int countByExample(TourExample example);

    int deleteByExample(TourExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TourWithBLOBs record);

    int insertSelective(TourWithBLOBs record);

    List<TourWithBLOBs> selectByExampleWithBLOBs(TourExample example);

    List<Tour> selectByExample(TourExample example);

    TourWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TourWithBLOBs record, @Param("example") TourExample example);

    int updateByExampleWithBLOBs(@Param("record") TourWithBLOBs record, @Param("example") TourExample example);

    int updateByExample(@Param("record") Tour record, @Param("example") TourExample example);

    int updateByPrimaryKeySelective(TourWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TourWithBLOBs record);

    int updateByPrimaryKey(Tour record);
}