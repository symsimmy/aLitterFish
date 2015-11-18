package com.lab.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * StanEquip entity. @author MyEclipse Persistence Tools
 */

public class StanEquip implements java.io.Serializable {

	// Fields

	private String id;
	private String type;
	private Set tianpingDatas = new HashSet(0);
	private Set xueyaDatas = new HashSet(0);
	private Set wenshijiDatas = new HashSet(0);

	// Constructors

	/** default constructor */
	public StanEquip() {
	}

	/** minimal constructor */
	public StanEquip(String id, String type) {
		this.id = id;
		this.type = type;
	}

	/** full constructor */
	public StanEquip(String id, String type, Set tianpingDatas, Set xueyaDatas,
			Set wenshijiDatas) {
		this.id = id;
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