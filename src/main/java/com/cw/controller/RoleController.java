package com.cw.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.cw.bean.Role;
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
	
	@RequestMapping(value="/edit/{id}",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ModelAndView findById(@PathVariable Integer id,Map<String, Object> map) {
		map.put("roleEnitiy", roleService.getRoleById(id));
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}
	
	
	@RequestMapping(value="/list",method = RequestMethod.POST)
	public ModelAndView addRole(@ModelAttribute Role role) {
		roleService.save(role);
		return new ModelAndView("redirect:/roleManage/list");
	}
	
	@RequestMapping(value="/list/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public ModelAndView delete(@PathVariable Integer id) {
		roleService.delete(id);
		
		return new ModelAndView("redirect:/roleManage/list");
	}
	
}
