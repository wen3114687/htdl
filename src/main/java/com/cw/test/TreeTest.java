package com.cw.test;

import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cw.bean.Function;
import com.cw.bean.TreeNode;
import com.cw.service.FunctionService;
import com.cw.utils.TreeUtils;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONUtil;

public class TreeTest {
	
	ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void TreeTestX() {
		
		FunctionService functionService=ioc.getBean(FunctionService.class);
		Collection<Function> fulist=  functionService.getAll();
		List<TreeNode> treenodes=CollectionUtil.newArrayList();
		for (Function function : fulist) {
			TreeNode td=new TreeNode();
			td.setId(function.getId());
			td.setParentId(function.getParentid());
			td.setIcon(function.getIcon());
			td.setLinkUrl(function.getPath());
			td.setName(function.getName());
			treenodes.add(td);
		}
		List<TreeNode> ls=   TreeUtils.build(treenodes, 0);
		Console.log(JSONUtil.formatJsonStr(JSONUtil.toJsonStr(ls)));
		
	}
}
