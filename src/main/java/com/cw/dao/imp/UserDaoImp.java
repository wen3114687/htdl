package com.cw.dao.imp;

import org.springframework.stereotype.Repository;

import com.cw.bean.User;
import com.cw.dao.UserDao;

@Repository
public class UserDaoImp extends BaseDaoImp<User> implements UserDao{

	@Override
	public Boolean login(User user) {
		
		Boolean flag=false;

		return flag;
		
	}

}
