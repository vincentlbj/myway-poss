package com.myway.poss.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@ModelAttribute
	public void setLink(Model model) {
		model.addAttribute("item", "index");
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		return "signin";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/login";
	}

	@RequestMapping("/loginSubmit")
	public String loginSubmit(String username, String password, Model model, HttpSession session) {
		if (username.equals("admin") && password.equals("admin")) {
			session.setAttribute("user", "user");
			return "redirect:/index";
		} else {
			model.addAttribute("error", "用户名或者密码错误");
			return "signin";
		}
	}
}
