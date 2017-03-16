package com.myway.poss.controller.exposure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myway.poss.pojo.Exposure;
import com.myway.poss.service.exposure.ExposureService;

@Controller
@RequestMapping("/exposure")
public class ExposureController {
	@Autowired
	private ExposureService exposureService;

	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "exposure");
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<Exposure> exposureList = exposureService.getExposure();
		model.addAttribute("exposureList", exposureList);
		return "exposure-list";
	}

	@RequestMapping("/insert")
	public String insert() {
		return "exposure-insert";
	}

	@RequestMapping("/insertSubmit")
	public String insertSubmit(Exposure exposure) {
		exposureService.insertExposure(exposure);
		return "redirect:/exposure/list";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		exposureService.deleteExposure(id);
		return "redirect:/exposure/list";
	}
}
