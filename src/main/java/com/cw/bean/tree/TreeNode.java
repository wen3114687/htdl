package com.cw.bean.tree;

import java.util.List;

import lombok.Data;

@Data
public class TreeNode {
	private String id;
	private String name;
	private String linkUrl;
	private String icon;
	private String parentId;
	private List<TreeNode> children;
}
