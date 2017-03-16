package com.myway.poss.mapper;

import com.myway.poss.pojo.Ticket;
import com.myway.poss.pojo.TicketExample;
import com.myway.poss.pojo.TicketWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketMapper {
    int countByExample(TicketExample example);

    int deleteByExample(TicketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketWithBLOBs record);

    int insertSelective(TicketWithBLOBs record);

    List<TicketWithBLOBs> selectByExampleWithBLOBs(TicketExample example);

    List<Ticket> selectByExample(TicketExample example);

    TicketWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketWithBLOBs record, @Param("example") TicketExample example);

    int updateByExampleWithBLOBs(@Param("record") TicketWithBLOBs record, @Param("example") TicketExample example);

    int updateByExample(@Param("record") Ticket record, @Param("example") TicketExample example);

    int updateByPrimaryKeySelective(TicketWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TicketWithBLOBs record);

    int updateByPrimaryKey(Ticket record);
}