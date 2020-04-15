package com.cw.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cw.service.RoleService;

@Controller
@RequestMapping("/roleManage")
public class RoleController {
	
	@Resource
	RoleService roleService;
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public String list(Map<String, Object> map) {
		map.put("rolelist", roleService.getAll());
		return "roleManage/list";
	}
	
	@RequestMapping(value="/list/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public ModelAndView delete(@PathVariable Integer id) {
		roleService.delete(id);
		return new ModelAndView("redirect:/roleManage/list");
	}
	
}
