package com.myway.poss.service.exposure;

import java.util.List;

import com.myway.poss.pojo.Exposure;

public interface ExposureService {
	List<Exposure> getExposure();

	void insertExposure(Exposure exposure);

	void deleteExposure(int id);
}
