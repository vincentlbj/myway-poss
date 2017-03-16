package com.myway.poss.controller.diary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myway.poss.pojo.Diary;
import com.myway.poss.pojo.DiaryRemark;
import com.myway.poss.service.diary.DiaryService;

@Controller
@RequestMapping("/diary")
public class DiaryController {
	@Autowired
	private DiaryService diaryService;

	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "diary");
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<Diary> diaryList = diaryService.getAllDiary();
		model.addAttribute("diaryList", diaryList);
		return "diary-list";
	}

	@RequestMapping("/detail/{id}")
	public String detail(@PathVariable int id, Model model) {
		Diary diaryDetail = diaryService.getDiaryDetail(id);
		List<DiaryRemark> remarkList = diaryService.getDiaryRemark(id);
		model.addAttribute("diaryDetail", diaryDetail);
		model.addAttribute("remarkList", remarkList);
		return "diary-detail";
	}

	@RequestMapping("/remark/delete/{id}/{dId}")
	public String deleteRemark(@PathVariable int id, @PathVariable int dId) {
		diaryService.deleteDiaryRemark(id);
		return "redirect:/diary/detail/" + dId;
	}

	@RequestMapping("/delete/{id}")
	public String deleteDiary(@PathVariable int id) {
		diaryService.deleteDiary(id);
		return "redirect:/diary/list";
	}
}
