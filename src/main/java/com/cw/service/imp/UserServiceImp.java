package com.cw.service.imp;

import java.util.Collection;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.cw.bean.User;
import com.cw.dao.UserDao;
import com.cw.service.UserService;
@Service
@Transactional
public class UserServiceImp implements UserService {

	@Resource
	UserDao userdao;

	@Override
	public void save(User user) {
		userdao.save(user);
		
	}

	@Override
	public void delete(Integer id) {
		userdao.delete(id);
		
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userdao.findByid(id);
	}

	@Override
	public void update(User user) {
		userdao.update(user);
		
	}

	@Override
	public Collection<User> getAll() {
		// TODO Auto-generated method stub
		return userdao.findAll();
	}
	
	

}
