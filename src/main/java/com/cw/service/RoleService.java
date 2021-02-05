package com.cw.service;

import java.util.Collection;

import com.cw.bean.Role;

public interface RoleService {
	void save(Role role);
	void delete(String id);
	Role getRoleById(String id);
	void update(Role role);
	Collection<Role> getAll();
}
