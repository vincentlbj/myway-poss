package com.myway.poss.mapper;

import com.myway.poss.pojo.DiaryRemark;
import com.myway.poss.pojo.DiaryRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiaryRemarkMapper {
    int countByExample(DiaryRemarkExample example);

    int deleteByExample(DiaryRemarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DiaryRemark record);

    int insertSelective(DiaryRemark record);

    List<DiaryRemark> selectByExample(DiaryRemarkExample example);

    DiaryRemark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DiaryRemark record, @Param("example") DiaryRemarkExample example);

    int updateByExample(@Param("record") DiaryRemark record, @Param("example") DiaryRemarkExample example);

    int updateByPrimaryKeySelective(DiaryRemark record);

    int updateByPrimaryKey(DiaryRemark record);
}