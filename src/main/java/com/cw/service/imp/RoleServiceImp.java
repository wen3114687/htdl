package com.cw.service.imp;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cw.bean.Role;
import com.cw.dao.RoleDao;
import com.cw.service.RoleService;

@Service
public class RoleServiceImp implements RoleService{
	
	@Resource
	RoleDao roleDao;
	
	@Transactional
	public void save(Role role) {
		roleDao.save(role);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		roleDao.delete(id);
	}

	@Override
	public Role getRoleById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Role> getAll() {
		List<Role> list=roleDao.findAll();
		return list;
	}
	
}
