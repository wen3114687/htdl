package com.cw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cw.bean.User;

@Controller
@RequestMapping("/system")
public class SystemController {
	
	@RequestMapping(value="/login")
	public ModelAndView  login(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/main");
		return modelAndView;
	}
}
