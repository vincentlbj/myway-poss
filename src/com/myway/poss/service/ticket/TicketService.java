package com.myway.poss.service.ticket;

import java.util.List;

import com.myway.poss.pojo.Ticket;
import com.myway.poss.pojo.TicketWithBLOBs;

public interface TicketService {
	List<Ticket> getTicketByCriteria(Ticket queryTicket, Integer pageNum, Integer pageSize);

	void insertTicket(TicketWithBLOBs ticketWithBLOBs);

	TicketWithBLOBs getTicketDetail(int id);

	void saveTicketDetail(TicketWithBLOBs ticketWithBLOBs);

	void deleteTicket(int id);
}
