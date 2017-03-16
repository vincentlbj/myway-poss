package com.myway.poss.service.impl.tour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.poss.mapper.TourMapper;
import com.myway.poss.mapper.TourPriceMapper;
import com.myway.poss.pojo.Tour;
import com.myway.poss.pojo.TourExample;
import com.myway.poss.pojo.TourPrice;
import com.myway.poss.pojo.TourPriceExample;
import com.myway.poss.pojo.TourWithBLOBs;
import com.myway.poss.service.tour.TourService;

@Service
public class TourServiceImpl implements TourService {

	@Autowired
	private TourMapper tourMapper;

	@Autowired
	private TourPriceMapper tourPriceMapper;

	@Override
	public List<Tour> getTourByCriteria(Tour queryTour, Integer pageNum, Integer pageSize) {
		return tourMapper.selectByExample(null);
	}

	@Override
	public TourWithBLOBs getTourDetail(int id) {
		return tourMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveTourDetail(TourWithBLOBs tourWithBlobs) {
		TourExample example = new TourExample();
		example.or().andIdEqualTo(tourWithBlobs.getId());
		tourMapper.updateByExampleWithBLOBs(tourWithBlobs, example);
	}

	@Override
	public void deleteTourDetail(int id) {
		tourMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insertTourDetail(TourWithBLOBs tourWithBLOBs) {
		tourMapper.insertSelective(tourWithBLOBs);
	}

	@Override
	public List<TourPrice> getTourPriceByTourId(int id) {
		TourPriceExample example = new TourPriceExample();
		example.or().andTIdEqualTo(id);
		return tourPriceMapper.selectByExample(example);
	}

	@Override
	public void insertTourPrice(TourPrice tourPrice) {
		tourPriceMapper.insertSelective(tourPrice);
	}

	@Override
	public void deleteTourPrice(int id) {
		tourPriceMapper.deleteByPrimaryKey(id);
	}

}
