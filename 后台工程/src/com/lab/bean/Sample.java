package com.lab.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Sample entity. @author MyEclipse Persistence Tools
 */

public class Sample implements java.io.Serializable {

	// Fields

	private String id;
	private String company;
	private String type;
	private Set tianpingDatas = new HashSet(0);
	private Set xueyaDatas = new HashSet(0);
	private Set wenshijiDatas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sample() {
	}

	/** minimal constructor */
	public Sample(String id, String company, String type) {
		this.id = id;
		this.company = company;
		this.type = type;
	}

	/** full constructor */
	public Sample(String id, String company, String type, Set tianpingDatas,
			Set xueyaDatas, Set wenshijiDatas) {
		this.id = id;
		this.company = company;
		this.type = type;
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

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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