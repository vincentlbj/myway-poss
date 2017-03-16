package com.myway.poss.service.impl.diary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.poss.mapper.DiaryMapper;
import com.myway.poss.mapper.DiaryRemarkMapper;
import com.myway.poss.pojo.Diary;
import com.myway.poss.pojo.DiaryRemark;
import com.myway.poss.pojo.DiaryRemarkExample;
import com.myway.poss.service.diary.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService {

	@Autowired
	private DiaryMapper diaryMapper;

	@Autowired
	private DiaryRemarkMapper diaryRemarkMapper;

	@Override
	public List<Diary> getAllDiary() {
		return diaryMapper.selectByExample(null);
	}

	@Override
	public Diary getDiaryDetail(int id) {
		return diaryMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteDiary(int id) {
		diaryMapper.deleteByPrimaryKey(id);

	}

	@Override
	public List<DiaryRemark> getDiaryRemark(int id) {
		DiaryRemarkExample example = new DiaryRemarkExample();
		example.or().andDIdEqualTo(id);
		List<DiaryRemark> remarkList = diaryRemarkMapper.selectByExample(example);
		return remarkList;
	}

	@Override
	public void deleteDiaryRemark(int id) {
		diaryRemarkMapper.deleteByPrimaryKey(id);
		DiaryRemarkExample example = new DiaryRemarkExample();
		example.or().andDIdEqualTo(id);
		diaryRemarkMapper.deleteByExample(example);
	}

}
