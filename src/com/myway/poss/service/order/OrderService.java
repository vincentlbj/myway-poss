package com.myway.poss.service.order;

import java.util.List;

import com.myway.poss.pojo.HotelOrder;
import com.myway.poss.pojo.TicketOrder;
import com.myway.poss.pojo.TourOrder;

public interface OrderService {
	List<TourOrder> getTourOrder();

	List<TicketOrder> getTicketOrder();

	List<HotelOrder> getHotelOrder();
}
