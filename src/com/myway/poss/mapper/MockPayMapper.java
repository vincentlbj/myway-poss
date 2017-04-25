package com.myway.poss.mapper;

import com.myway.poss.pojo.MockPay;
import com.myway.poss.pojo.MockPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MockPayMapper {
    int countByExample(MockPayExample example);

    int deleteByExample(MockPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MockPay record);

    int insertSelective(MockPay record);

    List<MockPay> selectByExample(MockPayExample example);

    MockPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MockPay record, @Param("example") MockPayExample example);

    int updateByExample(@Param("record") MockPay record, @Param("example") MockPayExample example);

    int updateByPrimaryKeySelective(MockPay record);

    int updateByPrimaryKey(MockPay record);
}