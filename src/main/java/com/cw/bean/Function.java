package com.cw.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="orgmodel_function")
public class Function {
	
	@Id
	@GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "parentid")
	private String parentid;
	
	@Column(name = "weight")
	private String weight;
	
	@Column(name = "icon")
	private String icon;
	
	@Column(name = "path")
	private String path;
	
	

	public Function(String id, String name, String parentid, String weight, String icon, String path) {
		this.id = id;
		this.name = name;
		this.parentid = parentid;
		this.weight = weight;
		this.icon = icon;
		this.path = path;
	}



	public Function() {
	}
	
	
	
}
