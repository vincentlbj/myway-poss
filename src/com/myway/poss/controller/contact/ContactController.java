package com.myway.poss.controller.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myway.poss.pojo.Contact;
import com.myway.poss.service.contact.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private ContactService contactService;

	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "contact");
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<Contact> contactList = contactService.getAllContact();
		model.addAttribute("contactList", contactList);
		return "contact-list";
	}
}
