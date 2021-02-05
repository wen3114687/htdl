package com.cw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cw.bean.Role;
import com.cw.bean.User;
import com.cw.service.UserService;

@Controller
@RequestMapping("/userManage")
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
	
	//增加
	@RequestMapping(value = "/list", method = RequestMethod.POST , produces = "application/json;charset=UTF-8")
	public ModelAndView addUser(@ModelAttribute User user) {
		userService.save(user);
		return new ModelAndView("redirect:/userManage/list");
	}
	
	//删除
	@RequestMapping(value = "/list/{id}", method = RequestMethod.DELETE)
	public ModelAndView deleteUser(@PathVariable String id) {
		userService.delete(id);
		return new ModelAndView("redirect:/userManage/list");
	}
	
	//修改
	//查询
	

}
