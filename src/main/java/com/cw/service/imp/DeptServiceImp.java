package com.cw.service.imp;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.cw.bean.Department;
import com.cw.bean.User;
import com.cw.dao.DeptDao;
import com.cw.dao.UserDao;
import com.cw.service.DeptService;
import com.cw.service.UserService;
@Service
public class DeptServiceImp implements DeptService {

	@Resource
	DeptDao deptDao;
	
	@Override
	@Transactional
	public void save(Department department) {
		deptDao.save(department);
		
	}
	


}
