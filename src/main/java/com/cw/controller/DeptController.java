package com.cw.controller;

import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.cw.bean.Department;
import com.cw.bean.Role;
import com.cw.service.DeptService;

@Controller
@RequestMapping("/depManage")
public class DeptController {
	
	@Resource
	DeptService deptService;
	
	@RequestMapping(value="/saveDept")
	public ModelAndView  saveUser(@ModelAttribute Department department) {
		ModelAndView modelAndView = new ModelAndView();
		deptService.save(department);
		modelAndView.setViewName("success");
		return  new ModelAndView("redirect:/depManage/list");
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Map<String, Object> map) {
		map.put("deptlist", deptService.getAll());
		return "depManage/list";
	}
	
	// 增加
	@RequestMapping(value = "/list", method = RequestMethod.POST , produces = "application/json;charset=UTF-8")
	public ModelAndView addRole(@ModelAttribute Department department) {
		deptService.save(department);
		return new ModelAndView("redirect:/depManage/list");
	}

}
