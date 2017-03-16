package com.myway.poss.service.impl.hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.poss.mapper.HotelMapper;
import com.myway.poss.pojo.Hotel;
import com.myway.poss.pojo.HotelExample;
import com.myway.poss.pojo.HotelWithBLOBs;
import com.myway.poss.service.hotel.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelMapper hotelMapper;

	@Override
	public List<Hotel> getHotelByCriteria(Hotel queryHotel, Integer pageNum, Integer pageSize) {
		return hotelMapper.selectByExample(null);
	}

	@Override
	public void insertHotel(HotelWithBLOBs hotelWithBLOBs) {
		hotelMapper.insertSelective(hotelWithBLOBs);
	}

	@Override
	public HotelWithBLOBs getHotelDetail(int id) {
		return hotelMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveHotelDetail(HotelWithBLOBs hotelWithBLOBs) {
		HotelExample hotelExample = new HotelExample();
		hotelExample.or().andIdEqualTo(hotelWithBLOBs.getId());
		hotelMapper.updateByExampleWithBLOBs(hotelWithBLOBs, hotelExample);

	}

	@Override
	public void deleteHotel(int id) {
		hotelMapper.deleteByPrimaryKey(id);
	}

}
