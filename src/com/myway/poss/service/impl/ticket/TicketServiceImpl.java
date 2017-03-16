package com.myway.poss.service.impl.ticket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.poss.mapper.TicketMapper;
import com.myway.poss.pojo.Ticket;
import com.myway.poss.pojo.TicketExample;
import com.myway.poss.pojo.TicketWithBLOBs;
import com.myway.poss.service.ticket.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketMapper ticketMapper;

	@Override
	public List<Ticket> getTicketByCriteria(Ticket queryTicket, Integer pageNum, Integer pageSize) {
		return ticketMapper.selectByExample(null);
	}

	@Override
	public void insertTicket(TicketWithBLOBs ticketWithBLOBs) {
		ticketMapper.insertSelective(ticketWithBLOBs);
	}

	@Override
	public TicketWithBLOBs getTicketDetail(int id) {
		return ticketMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveTicketDetail(TicketWithBLOBs ticketWithBLOBs) {
		TicketExample ticketExample = new TicketExample();
		ticketExample.or().andIdEqualTo(ticketWithBLOBs.getId());
		ticketMapper.updateByExampleWithBLOBs(ticketWithBLOBs, ticketExample);

	}

	@Override
	public void deleteTicket(int id) {
		ticketMapper.deleteByPrimaryKey(id);
	}

}
