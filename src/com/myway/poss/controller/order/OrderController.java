package com.myway.poss.controller.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myway.poss.pojo.HotelOrder;
import com.myway.poss.pojo.TicketOrder;
import com.myway.poss.pojo.TourOrder;
import com.myway.poss.service.order.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "order");
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<TourOrder> tourOrderList = orderService.getTourOrder();
		List<HotelOrder> hotelOrderList = orderService.getHotelOrder();
		List<TicketOrder> ticketOrderList = orderService.getTicketOrder();
		model.addAttribute("tourOrderList", tourOrderList);
		model.addAttribute("hotelOrderList", hotelOrderList);
		model.addAttribute("ticketOrderList", ticketOrderList);
		return "order";
	}
}
