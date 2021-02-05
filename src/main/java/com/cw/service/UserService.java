package com.cw.service;

import java.util.Collection;

import com.cw.bean.User;

public interface UserService {
	void save(User user);
	void delete(String id);
	User getUserById(String id);
	void update(User user);
	Collection<User> getAll();
}
