package com.myway.poss.service.impl.exposure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.poss.mapper.ExposureMapper;
import com.myway.poss.pojo.Exposure;
import com.myway.poss.service.exposure.ExposureService;

@Service
public class ExposureServiceImpl implements ExposureService {

	@Autowired
	private ExposureMapper exposureMapper;

	@Override
	public List<Exposure> getExposure() {
		return exposureMapper.selectByExample(null);
	}

	@Override
	public void insertExposure(Exposure exposure) {
		exposureMapper.insertSelective(exposure);
	}

	@Override
	public void deleteExposure(int id) {
		exposureMapper.deleteByPrimaryKey(id);
	}

}
