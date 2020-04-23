package com.cw.service.imp;

import java.util.Collection;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cw.bean.Department;
import com.cw.dao.DeptDao;
import com.cw.service.DeptService;
@Service
@Transactional
public class DeptServiceImp implements DeptService {

	@Resource
	DeptDao deptDao;
	

	public void save(Department department) {
		deptDao.save(department);
		
	}


	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Department getDepById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void update(Department department) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<Department> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Collection<Department> getTopDepts() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
