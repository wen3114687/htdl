package com.cw.service.imp;

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
	


}
