package com.cw.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cw.bean.Role;
import com.cw.controller.RoleController;


public class AOPTest {
	ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	@Test
	public void ts() {
		
		RoleController bean= ioc.getBean(RoleController.class);
		
		Role role=new Role();
		role.setAuth("1123");
		role.setDescription("2222");
		role.setRolename("roleb");
		bean.addRole(role);
	}
}
