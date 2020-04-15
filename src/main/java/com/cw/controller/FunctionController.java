package com.cw.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cw.service.FunctionService;
import com.cw.service.RoleService;

@Controller
@RequestMapping("/functionManage")
public class FunctionController {
	
	@Resource
	FunctionService functionService;
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public String list(Map<String, Object> map) {
		map.put("functionlist", functionService.getAll());
		return "functionManage/list";
	}
	
	@RequestMapping(value="/list/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public ModelAndView delete(@PathVariable String id) {
		functionService.delete(id);
		return new ModelAndView("redirect:/functionManage/list");
	}
	//TODO : 做function jsp页面
	
}
