package com.cw.dao;

import java.util.List;

import com.cw.bean.Department;

public interface DeptDao extends BaseDao<Department>{
	List<Department> findTopDepts();
}
