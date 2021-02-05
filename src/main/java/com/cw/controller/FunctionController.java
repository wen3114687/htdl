package com.cw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cw.bean.Function;
import com.cw.service.FunctionService;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNode;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.json.JSONUtil;

@Controller
@RequestMapping("/functionManage")
public class FunctionController {
	
	@Resource
	FunctionService functionService;
	
	@RequestMapping(value="/list/{id}",method = RequestMethod.GET)
	public String list(Map<String, Object> map,@PathVariable String id) {
		List<Function> li=(List<Function>) functionService.getAll();
		List<TreeNode<String>> nodeList = CollUtil.newArrayList();
		for (int i = 0; i < li.size(); i++) {
			Function funObj=li.get(i);
			TreeNode<String> tn=new TreeNode<String>();
			tn.setId(funObj.getId());
			tn.setName(funObj.getName());
			tn.setParentId(funObj.getParentid());
			tn.setWeight(funObj.getWeight());
			Map<String, Object> extra = new HashMap<>();
			extra.put("url", funObj.getPath());
			tn.setExtra(extra);
		}
		List<Tree<String>> treeList = TreeUtil.build(nodeList, id);
		
		map.put("functionTree", treeList);
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
