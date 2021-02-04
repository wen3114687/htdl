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
@Table(name="orgmodel_dep")
public class Department {
	
	@Id
	@GenericGenerator(name="idGenerator", strategy="org.hibernate.id.UUIDGenerator") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
	private String id;
	
	@Column(name = "depname")
	private String depname;
	
	@Column(name = "path")
	private String path;
	
	@Column(name = "parentid")
	private String parentid;
	
	@Column(name = "depType")
	private String depType;
	
}
