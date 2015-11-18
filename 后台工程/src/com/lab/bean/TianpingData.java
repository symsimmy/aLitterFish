package com.lab.bean;

/**
 * TianpingData entity. @author MyEclipse Persistence Tools
 */

public class TianpingData implements java.io.Serializable {

	// Fields

	private TianpingDataId id;
	private Sample sample;
	private Staff staff;
	private StanEquip stanEquip;
	private Double stanPressure;
	private Double samplePressure;

	// Constructors

	/** default constructor */
	public TianpingData() {
	}

	/** full constructor */
	public TianpingData(TianpingDataId id, Sample sample, Staff staff,
			StanEquip stanEquip, Double stanPressure, Double samplePressure) {
		this.id = id;
		this.sample = sample;
		this.staff = staff;
		this.stanEquip = stanEquip;
		this.stanPressure = stanPressure;
		this.samplePressure = samplePressure;
	}

	// Property accessors

	public TianpingDataId getId() {
		return this.id;
	}

	public void setId(TianpingDataId id) {
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

	public Double getStanPressure() {
		return this.stanPressure;
	}

	public void setStanPressure(Double stanPressure) {
		this.stanPressure = stanPressure;
	}

	public Double getSamplePressure() {
		return this.samplePressure;
	}

	public void setSamplePressure(Double samplePressure) {
		this.samplePressure = samplePressure;
	}

}