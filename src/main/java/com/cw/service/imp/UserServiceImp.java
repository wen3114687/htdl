package com.cw.service.imp;

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
	
	public void save(User user) {
		userdao.save(user);

	}
	
	
	public void login(User user) {
		Boolean flag=userdao.login(user);
		System.out.println(flag);
	}

}
