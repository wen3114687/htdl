package com.cw.bean.tree;

import java.util.HashMap;

@SuppressWarnings("unchecked")
public class TreeNodeMap extends HashMap{
	private TreeNodeConfig tndconfig;
	
	public TreeNodeMap() {
		this.tndconfig=TreeNodeConfig.getDefaultConfig();
	}
	
	
	public <T> T getId() {
		return (T)super.get(tndconfig.getIdkey());
	}
	
	public void setId(String id) {
		super.put(tndconfig.getIdkey(), id);
	}
	
}
