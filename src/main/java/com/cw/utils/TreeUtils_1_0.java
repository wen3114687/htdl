package com.cw.utils;

import java.util.ArrayList;
import java.util.List;


import com.cw.bean.TreeNode;

import cn.hutool.core.collection.CollectionUtil;


public class TreeUtils_1_0 {
	public static List<TreeNode> build(List<TreeNode> treenodes,Integer pid) {
		List<TreeNode> list =CollectionUtil.newArrayList();
		
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
