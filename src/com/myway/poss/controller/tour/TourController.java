package com.myway.poss.controller.tour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myway.poss.pojo.Tour;
import com.myway.poss.pojo.TourPrice;
import com.myway.poss.pojo.TourWithBLOBs;
import com.myway.poss.service.tour.TourService;

@Controller
@RequestMapping("/tour")
public class TourController {
	@Autowired
	private TourService tourService;

	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "tour");
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<Tour> tourList = tourService.getTourByCriteria(null, 0, 0);
		model.addAttribute("tourList", tourList);
		return "tour-list";
	}

	@RequestMapping("/insert")
	public String insert() {
		return "tour-insert";
	}

	@RequestMapping("/insertSubmit")
	public String insertSubmit(TourWithBLOBs tourWithBLOBs) {
		tourService.insertTourDetail(tourWithBLOBs);
		return "redirect:/tour/list";
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		Tour queryTour = new Tour();
		queryTour.setId(id);
		TourWithBLOBs tourDetail = tourService.getTourDetail(id);
		if (tourDetail == null) {
			return "error";
		}
		model.addAttribute("tourDetail", tourDetail);
		return "tour-edit";
	}

	@RequestMapping("/editSubmit/{id}")
	public String editSubmit(@PathVariable int id, TourWithBLOBs tour) {
		tourService.saveTourDetail(tour);
		return "redirect:/tour/list";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		tourService.deleteTourDetail(id);
		return "redirect:/tour/list";
	}

	@RequestMapping("/price/{id}")
	public String priceList(@PathVariable int id, Model model) {
		List<TourPrice> tourPriceList = tourService.getTourPriceByTourId(id);
		model.addAttribute("tourPriceList", tourPriceList);
		model.addAttribute("tourId", id);
		return "tourprice-list";
	}

	@RequestMapping("/price/insert/{id}")
	public String insertPrice(@PathVariable int id, Model model) {
		model.addAttribute("tourId", id);
		return "tourprice-insert";
	}

	@RequestMapping("/price/insertSubmit")
	public String insertPriceSubmit(TourPrice tourPrice) {
		tourService.insertTourPrice(tourPrice);
		return "redirect:/tour/list";
	}

	@RequestMapping("/price/delete/{id}/{tourId}")
	public String deletePrice(@PathVariable int id, @PathVariable int tourId) {
		tourService.deleteTourPrice(id);
		return "redirect:/tour/price/" + tourId;
	}
}
