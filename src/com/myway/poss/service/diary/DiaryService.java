package com.myway.poss.service.diary;

import java.util.List;

import com.myway.poss.pojo.Diary;
import com.myway.poss.pojo.DiaryRemark;

public interface DiaryService {
	List<Diary> getAllDiary();

	Diary getDiaryDetail(int id);

	void deleteDiary(int id);

	void deleteDiaryRemark(int id);

	List<DiaryRemark> getDiaryRemark(int id);
}
