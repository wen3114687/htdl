package com.cw.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.cw.bean.Function;
import com.cw.bean.tree.TreeNode;

import cn.hutool.core.collection.CollectionUtil;


public class TreeUtils_1_0 {
	public static List<TreeNode> build(List<Function> functionlist,Integer pid) {
		List<TreeNode> list =CollectionUtil.newArrayList();
		List<TreeNode> treenodes =CollectionUtil.newArrayList();
		for (Function function : functionlist) {
			TreeNode td=new TreeNode();
			td.setId(function.getId());
			td.setParentId(function.getParentid());
			td.setIcon(function.getIcon());
			td.setLinkUrl(function.getPath());
			td.setName(function.getName());
			treenodes.add(td);
		}
		for (TreeNode treeNode:treenodes) {
			if(treeNode.getParentId().equals(pid)) {
				list.add(treeNode);
				innerBuild(treenodes,treeNode);
			}
		}
		return list;
	}
	
	public static void innerBuild(List<TreeNode> treenodes,TreeNode pTreenode) {
		
		for (TreeNode treeNode:treenodes) {
			if(treeNode.getParentId().equals(pTreenode.getId())) {
				List<TreeNode> children=pTreenode.getChildren();
				if(children==null) {
					children=new ArrayList<TreeNode>();
					pTreenode.setChildren(children);
				}
				children.add(treeNode);
				innerBuild(treenodes,treeNode);
			}
		}
		
	}
	
}
