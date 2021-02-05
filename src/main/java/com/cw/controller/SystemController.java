package com.cw.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cw.bean.Function;
import com.cw.bean.User;
import com.cw.service.FunctionService;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.json.JSONUtil;

@Controller
@RequestMapping("/system")
public class SystemController {
	
	@Resource
	FunctionService functionService;
	
	@RequestMapping(value="/login")
	public ModelAndView  login(Map<String, Object> map,@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		List<Function> li=(List<Function>) functionService.getAll();
		TreeNodeConfig treeNodeConfig = new TreeNodeConfig();
		treeNodeConfig.setDeep(2);
		 List<Tree<String>> build = TreeUtil.build(li, "0", treeNodeConfig,
	                (treeNode, tree) -> {
	                    tree.setId(treeNode.getId().toString());
	                    tree.setParentId(treeNode.getParentid());
	                    tree.setWeight(treeNode.getWeight());
	                    tree.setName(treeNode.getName());

	                    // 扩展属性
	                    tree.putExtra("text", treeNode.getName());
	                    tree.putExtra("iconCls", treeNode.getIcon());
	                    tree.putExtra("url", treeNode.getPath());

	                });
		
		
		map.put("functionTree", JSONUtil.toJsonStr(build));
		
		modelAndView.setViewName("system/main");
		return modelAndView;
	}
}
