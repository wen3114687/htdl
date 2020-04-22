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

	// 增加
	@RequestMapping(value = "/list", method = RequestMethod.POST , produces = "application/json;charset=UTF-8")
	public ModelAndView addRole(@ModelAttribute Role role) {
		roleService.save(role);
		return new ModelAndView("redirect:/roleManage/lists");
	}

	// 删除
	@RequestMapping(value = "/list/{id}", method = RequestMethod.DELETE)
	public ModelAndView deleteRole(@PathVariable Integer id) {
		roleService.delete(id);
		return new ModelAndView("redirect:/roleManage/lists");
	}

	// 更新
	@RequestMapping(value = "/list/{id}", method = RequestMethod.PUT)
	public ModelAndView updateRole(@ModelAttribute Role role,@PathVariable Integer id) {
		roleService.update(role);
		return new ModelAndView("redirect:/roleManage/lists");
	}
	//查询列表
	@RequestMapping(value = "/lists", method = RequestMethod.GET)
	public String list(Map<String, Object> map) {
		map.put("rolelist", roleService.getAll());
		return "roleManage/list";
	}
	//通过ID查询
	@RequestMapping(value = "/list/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ModelAndView findRoleById(@PathVariable("id") Integer id, Map<String, Object> map) {
		map.put("roleEnitiy", roleService.getRoleById(id));
		return new ModelAndView(new MappingJackson2JsonView(), map);
	}

}
