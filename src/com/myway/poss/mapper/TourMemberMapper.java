package com.myway.poss.mapper;

import com.myway.poss.pojo.TourMember;
import com.myway.poss.pojo.TourMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TourMemberMapper {
    int countByExample(TourMemberExample example);

    int deleteByExample(TourMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TourMember record);

    int insertSelective(TourMember record);

    List<TourMember> selectByExample(TourMemberExample example);

    TourMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TourMember record, @Param("example") TourMemberExample example);

    int updateByExample(@Param("record") TourMember record, @Param("example") TourMemberExample example);

    int updateByPrimaryKeySelective(TourMember record);

    int updateByPrimaryKey(TourMember record);
}