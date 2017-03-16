package com.myway.poss.service.tour;

import java.util.List;

import com.myway.poss.pojo.Tour;
import com.myway.poss.pojo.TourPrice;
import com.myway.poss.pojo.TourWithBLOBs;

public interface TourService {
	List<Tour> getTourByCriteria(Tour queryTour, Integer pageNum, Integer pageSize);

	TourWithBLOBs getTourDetail(int id);

	void saveTourDetail(TourWithBLOBs tourWithBlobs);

	void deleteTourDetail(int id);

	void insertTourDetail(TourWithBLOBs tourWithBLOBs);

	List<TourPrice> getTourPriceByTourId(int id);

	void insertTourPrice(TourPrice tourPrice);

	void deleteTourPrice(int id);
}
