package com.lab.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Staff entity. @author MyEclipse Persistence Tools
 */

public class Staff implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String password;
	private String position;
	private Boolean isInService;
	private Set tianpingDatas = new HashSet(0);
	private Set xueyaDatas = new HashSet(0);
	private Set wenshijiDatas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Staff() {
	}

	/** minimal constructor */
	public Staff(String id, String name, String password, String position, Boolean isInService) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.position = position;
		this.setIsInService(isInService);
	}

	/** full constructor */
	public Staff(String id, String name, String password, String position, Boolean isInService,
			Set tianpingDatas, Set xueyaDatas, Set wenshijiDatas) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.position = position;
		this.setIsInService(isInService);
		this.tianpingDatas = tianpingDatas;
		this.xueyaDatas = xueyaDatas;
		this.wenshijiDatas = wenshijiDatas;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Boolean getIsInService() {
		return this.isInService;
	}

	public void setIsInService(Boolean isInService) {
		this.isInService = isInService;
	}

	public Set getTianpingDatas() {
		return this.tianpingDatas;
	}

	public void setTianpingDatas(Set tianpingDatas) {
		this.tianpingDatas = tianpingDatas;
	}

	public Set getXueyaDatas() {
		return this.xueyaDatas;
	}

	public void setXueyaDatas(Set xueyaDatas) {
		this.xueyaDatas = xueyaDatas;
	}

	public Set getWenshijiDatas() {
		return this.wenshijiDatas;
	}

	public void setWenshijiDatas(Set wenshijiDatas) {
		this.wenshijiDatas = wenshijiDatas;
	}

	

}