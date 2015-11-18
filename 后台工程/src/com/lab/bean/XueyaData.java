package com.lab.bean;

/**
 * XueyaData entity. @author MyEclipse Persistence Tools
 */

public class XueyaData implements java.io.Serializable {

	// Fields

	private XueyaDataId id;
	private Sample sample;
	private Staff staff;
	private StanEquip stanEquip;
	private Double stanHigh;
	private Double stanLow;
	private Double sampleHigh;
	private Double sampleLow;

	// Constructors

	/** default constructor */
	public XueyaData() {
	}

	/** full constructor */
	public XueyaData(XueyaDataId id, Sample sample, Staff staff,
			StanEquip stanEquip, Double stanHigh, Double stanLow,
			Double sampleHigh, Double sampleLow) {
		this.id = id;
		this.sample = sample;
		this.staff = staff;
		this.stanEquip = stanEquip;
		this.stanHigh = stanHigh;
		this.stanLow = stanLow;
		this.sampleHigh = sampleHigh;
		this.sampleLow = sampleLow;
	}

	// Property accessors

	public XueyaDataId getId() {
		return this.id;
	}

	public void setId(XueyaDataId id) {
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

	public Double getStanHigh() {
		return this.stanHigh;
	}

	public void setStanHigh(Double stanHigh) {
		this.stanHigh = stanHigh;
	}

	public Double getStanLow() {
		return this.stanLow;
	}

	public void setStanLow(Double stanLow) {
		this.stanLow = stanLow;
	}

	public Double getSampleHigh() {
		return this.sampleHigh;
	}

	public void setSampleHigh(Double sampleHigh) {
		this.sampleHigh = sampleHigh;
	}

	public Double getSampleLow() {
		return this.sampleLow;
	}

	public void setSampleLow(Double sampleLow) {
		this.sampleLow = sampleLow;
	}

}