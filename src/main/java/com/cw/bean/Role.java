package com.cw.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="orgmodel_role")
public class Role {
	
	@Id
	@GeneratedValue
	private String id;
	
	@Column(name = "rolename")
	private String rolename;
	
	@Column(name = "auth")
	private String auth;
	
	@Column(name = "description")
	private String description;
}
