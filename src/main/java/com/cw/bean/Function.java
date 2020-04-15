package com.cw.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orgmodel_function")
public class Function {
	
	@Id
	@GeneratedValue
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
}
