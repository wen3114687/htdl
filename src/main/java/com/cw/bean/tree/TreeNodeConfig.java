package com.cw.bean.tree;

public class TreeNodeConfig {
	
	// 默认属性的单例对象

    private static TreeNodeConfig defaultConfig = new TreeNodeConfig();

    
    static final String TREE_ID ="id";
    static final String TREE_NAME ="name";
    static final String TREE_CODE ="code";
    static final String TREE_CHILDREN ="children";
    static final String TREE_PARENT_ID ="parentId";
    
    
    
    private String idkey;
    private String codeKey;
    private String nameKey;
    private String childrenKey;
    private String parentIdKey;

    

    
	public String getIdkey() {
		return getOrDefault(idkey,TREE_ID);
	}

	public void setIdkey(String idkey) {
		this.idkey = idkey;
	}

	public String getCodeKey() {
		return getOrDefault(codeKey,TREE_CODE);
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getNameKey() {
		return getOrDefault(nameKey,TREE_NAME);
	}

	public void setNameKey(String nameKey) {
		this.nameKey = nameKey;
	}

	public String getChildrenKey() {
		return getOrDefault(childrenKey,TREE_CHILDREN);
	}

	public void setChildrenKey(String childrenKey) {
		this.childrenKey = childrenKey;
	}

	public String getParentIdKey() {
		return getOrDefault(parentIdKey,TREE_PARENT_ID);
	}

	public void setParentIdKey(String parentIdKey) {
		this.parentIdKey = parentIdKey;
	}

	public String getOrDefault(String key,String defaultKey){
			if(key==null) {
				return defaultKey;
			}
			return key;
		}

	public static TreeNodeConfig getDefaultConfig(){
        return defaultConfig;
	}
}
