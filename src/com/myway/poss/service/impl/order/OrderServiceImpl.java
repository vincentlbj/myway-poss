package com.myway.poss.service.impl.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.poss.mapper.HotelOrderMapper;
import com.myway.poss.mapper.TicketOrderMapper;
import com.myway.poss.mapper.TourOrderMapper;
import com.myway.poss.pojo.HotelOrder;
import com.myway.poss.pojo.TicketOrder;
import com.myway.poss.pojo.TourOrder;
import com.myway.poss.service.order.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private TourOrderMapper tourOrderMapper;
	@Autowired
	private HotelOrderMapper hotelOrderMapper;
	@Autowired
	private TicketOrderMapper ticketOrderMapper;

	@Override
	public List<TourOrder> getTourOrder() {
		return tourOrderMapper.selectByExample(null);
	}

	@Override
	public List<TicketOrder> getTicketOrder() {
		return ticketOrderMapper.selectByExample(null);
	}

	@Override
	public List<HotelOrder> getHotelOrder() {
		return hotelOrderMapper.selectByExample(null);
	}

}
