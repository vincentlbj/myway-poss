package com.myway.poss.controller.hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myway.poss.pojo.Hotel;
import com.myway.poss.pojo.HotelWithBLOBs;
import com.myway.poss.service.hotel.HotelService;

@Controller
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	private HotelService hotelService;

	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "hotel");
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<Hotel> hotelList = hotelService.getHotelByCriteria(null, 0, 0);
		model.addAttribute("hotelList", hotelList);
		return "hotel-list";
	}

	@RequestMapping("/insert")
	public String insert() {
		return "hotel-insert";
	}

	@RequestMapping("/insertSubmit")
	public String insertSubmit(HotelWithBLOBs hotelWithBLOBs) {
		hotelService.insertHotel(hotelWithBLOBs);
		return "redirect:/hotel/list";
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		Hotel queryHotel = new Hotel();
		queryHotel.setId(id);
		HotelWithBLOBs hotelDetail = hotelService.getHotelDetail(id);
		if (hotelDetail == null) {
			return "error";
		}
		model.addAttribute("hotelDetail", hotelDetail);
		return "hotel-edit";
	}

	@RequestMapping("/editSubmit/{id}")
	public String editSubmit(@PathVariable int id, HotelWithBLOBs hotelWithBLOBs) {
		hotelService.saveHotelDetail(hotelWithBLOBs);
		return "redirect:/hotel/list";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		hotelService.deleteHotel(id);
		return "redirect:/hotel/list";
	}
}
