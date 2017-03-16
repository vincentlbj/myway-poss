package com.myway.poss.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myway.poss.pojo.User;
import com.myway.poss.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "user");
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<User> userList = userService.getAllUser();
		model.addAttribute("userList", userList);
		return "user-list";
	}

}
