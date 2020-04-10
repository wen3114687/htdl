package com.cw.dao;

import com.cw.bean.User;

public interface UserDao extends BaseDao<User>{
	Boolean login(User user);
}
