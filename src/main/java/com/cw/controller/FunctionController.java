package com.cw.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.cw.bean.Function;
import com.cw.service.FunctionService;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
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
		TreeNodeConfig treeNodeConfig = new TreeNodeConfig();
		List<Tree<String>> build = TreeUtil.build(li, "0", treeNodeConfig,
                (treeNode, tree) -> {
                    tree.setId(treeNode.getId());
                    tree.setParentId(treeNode.getParentid());
                    tree.setWeight(treeNode.getWeight());
                    tree.setName(treeNode.getName());
                });
		
		map.put("functionTree", JSONUtil.toJsonStr(build));
		return "functionManage/list";
	}


	// 增加
	@RequestMapping(value = "/list", method = RequestMethod.POST , produces = "application/json;charset=UTF-8")
	public ModelAndView addFunction(@ModelAttribute Function function) {
		functionService.save(function);
		return new ModelAndView("redirect:/functionManage/list");
	}
	
	@RequestMapping(value="/list/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public ModelAndView delete(@PathVariable String id) {
		functionService.delete(id);
		return new ModelAndView("redirect:/functionManage/list");
	}
	//TODO : 做function jsp页面
	
}
