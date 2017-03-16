package com.myway.poss.service.hotel;

import java.util.List;

import com.myway.poss.pojo.Hotel;
import com.myway.poss.pojo.HotelWithBLOBs;

public interface HotelService {
	List<Hotel> getHotelByCriteria(Hotel queryHotel, Integer pageNum, Integer pageSize);

	void insertHotel(HotelWithBLOBs hotelWithBLOBs);

	HotelWithBLOBs getHotelDetail(int id);

	void saveHotelDetail(HotelWithBLOBs hotelWithBLOBs);

	void deleteHotel(int id);
}
