package com.cw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cw.bean.Department;
import com.cw.bean.User;
import com.cw.service.DeptService;
import com.cw.service.UserService;

@Controller
public class DeptController {
	
	@Resource
	DeptService deptService;
	
	@RequestMapping(value="/saveUser")
	public ModelAndView  saveUser(@ModelAttribute Department department) {
		ModelAndView modelAndView = new ModelAndView();
		deptService.save(department);
		modelAndView.setViewName("success");
		return  new ModelAndView("redirect:/roleManage/list");;
	}
	

}
