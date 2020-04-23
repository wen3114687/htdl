package com.cw.service;

import java.util.Collection;

import com.cw.bean.Department;

public interface DeptService {
	void save(Department department);
	
	void delete(Integer id);
	Department getDepById(Integer id);
	void update(Department department);
	Collection<Department> getAll();
	Collection<Department> getTopDepts();
}
