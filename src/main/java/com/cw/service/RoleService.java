package com.cw.service;

import java.util.Collection;

import com.cw.bean.Role;

public interface RoleService {
	void save(Role role);
	void delete(Integer id);
	Role getRoleById(Integer id);
	void update(Role role);
	Collection<Role> getAll();
}
