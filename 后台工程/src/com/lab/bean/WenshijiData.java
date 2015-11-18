package com.lab.bean;

/**
 * WenshijiData entity. @author MyEclipse Persistence Tools
 */

public class WenshijiData implements java.io.Serializable {

	// Fields

	private WenshijiDataId id;
	private Sample sample;
	private Staff staff;
	private StanEquip stanEquip;
	private Double stanWendu;
	private Double stanShidu;
	private Double sampleWendu;
	private Double sampleShidu;

	// Constructors

	/** default constructor */
	public WenshijiData() {
	}

	/** full constructor */
	public WenshijiData(WenshijiDataId id, Sample sample, Staff staff,
			StanEquip stanEquip, Double stanWendu, Double stanShidu,
			Double sampleWendu, Double sampleShidu) {
		this.id = id;
		this.sample = sample;
		this.staff = staff;
		this.stanEquip = stanEquip;
		this.stanWendu = stanWendu;
		this.stanShidu = stanShidu;
		this.sampleWendu = sampleWendu;
		this.sampleShidu = sampleShidu;
	}

	// Property accessors

	public WenshijiDataId getId() {
		return this.id;
	}

	public void setId(WenshijiDataId id) {
		this.id = id;
	}

	public Sample getSample() {
		return this.sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public StanEquip getStanEquip() {
		return this.stanEquip;
	}

	public void setStanEquip(StanEquip stanEquip) {
		this.stanEquip = stanEquip;
	}

	public Double getStanWendu() {
		return this.stanWendu;
	}

	public void setStanWendu(Double stanWendu) {
		this.stanWendu = stanWendu;
	}

	public Double getStanShidu() {
		return this.stanShidu;
	}

	public void setStanShidu(Double stanShidu) {
		this.stanShidu = stanShidu;
	}

	public Double getSampleWendu() {
		return this.sampleWendu;
	}

	public void setSampleWendu(Double sampleWendu) {
		this.sampleWendu = sampleWendu;
	}

	public Double getSampleShidu() {
		return this.sampleShidu;
	}

	public void setSampleShidu(Double sampleShidu) {
		this.sampleShidu = sampleShidu;
	}

}