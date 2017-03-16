package com.myway.poss.controller.ticket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myway.poss.pojo.Ticket;
import com.myway.poss.pojo.TicketWithBLOBs;
import com.myway.poss.service.ticket.TicketService;

@Controller
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketService ticketService;

	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "ticket");
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<Ticket> ticketList = ticketService.getTicketByCriteria(null, 0, 0);
		model.addAttribute("ticketList", ticketList);
		return "ticket-list";
	}

	@RequestMapping("/insert")
	public String insert() {
		return "ticket-insert";
	}

	@RequestMapping("/insertSubmit")
	public String insertSubmit(TicketWithBLOBs ticketWithBLOBs) {
		ticketService.insertTicket(ticketWithBLOBs);
		return "redirect:/ticket/list";
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		Ticket queryTicket = new Ticket();
		queryTicket.setId(id);
		TicketWithBLOBs ticketDetail = ticketService.getTicketDetail(id);
		if (ticketDetail == null) {
			return "error";
		}
		model.addAttribute("ticketDetail", ticketDetail);
		return "ticket-edit";
	}

	@RequestMapping("/editSubmit/{id}")
	public String editSubmit(@PathVariable int id, TicketWithBLOBs TicketWithBLOBs) {
		ticketService.saveTicketDetail(TicketWithBLOBs);
		return "redirect:/ticket/list";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		ticketService.deleteTicket(id);
		return "redirect:/ticket/list";
	}
}
