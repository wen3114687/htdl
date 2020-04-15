package com.cw.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orgmodel_dep")
public class Department {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "depname")
	private String depname;
	
	@Column(name = "path")
	private String path;
	
	@Column(name = "parentid")
	private String parentid;
	
	@Column(name = "depType")
	private String depType;
	
}
