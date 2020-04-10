package com.cw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cw.bean.User;
import com.cw.service.UserService;

@Controller
public class UserController {
	
	@Resource
	UserService userService;
	
	@RequestMapping(value="/saveUser")
	public ModelAndView  saveUser(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		userService.save(user);
		modelAndView.setViewName("success");
		return modelAndView;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView  login(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("success");
		return modelAndView;
	}
}
