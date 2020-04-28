package com.cw.bean;

import java.util.List;

import lombok.Data;

@Data
public class TreeNode {
	private Integer id;
	private String name;
	private String linkUrl;
	private String icon;
	private Integer parentId;
	private List<TreeNode> children;
}
