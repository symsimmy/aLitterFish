package com.lab.bean;

import java.sql.Timestamp;

/**
 * XueyaDataId entity. @author MyEclipse Persistence Tools
 */

public class XueyaDataId implements java.io.Serializable {

	// Fields

	private String staffId;
	private String equipId;
	private String sampleId;
	private Timestamp testtime;

	// Constructors

	/** default constructor */
	public XueyaDataId() {
	}

	/** full constructor */
	public XueyaDataId(String staffId, String equipId, String sampleId,
			Timestamp testtime) {
		this.staffId = staffId;
		this.equipId = equipId;
		this.sampleId = sampleId;
		this.testtime = testtime;
	}

	// Property accessors

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getEquipId() {
		return this.equipId;
	}

	public void setEquipId(String equipId) {
		this.equipId = equipId;
	}

	public String getSampleId() {
		return this.sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}

	public Timestamp getTesttime() {
		return this.testtime;
	}

	public void setTesttime(Timestamp testtime) {
		this.testtime = testtime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof XueyaDataId))
			return false;
		XueyaDataId castOther = (XueyaDataId) other;

		return ((this.getStaffId() == castOther.getStaffId()) || (this
				.getStaffId() != null && castOther.getStaffId() != null && this
				.getStaffId().equals(castOther.getStaffId())))
				&& ((this.getEquipId() == castOther.getEquipId()) || (this
						.getEquipId() != null && castOther.getEquipId() != null && this
						.getEquipId().equals(castOther.getEquipId())))
				&& ((this.getSampleId() == castOther.getSampleId()) || (this
						.getSampleId() != null
						&& castOther.getSampleId() != null && this
						.getSampleId().equals(castOther.getSampleId())))
				&& ((this.getTesttime() == castOther.getTesttime()) || (this
						.getTesttime() != null
						&& castOther.getTesttime() != null && this
						.getTesttime().equals(castOther.getTesttime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStaffId() == null ? 0 : this.getStaffId().hashCode());
		result = 37 * result
				+ (getEquipId() == null ? 0 : this.getEquipId().hashCode());
		result = 37 * result
				+ (getSampleId() == null ? 0 : this.getSampleId().hashCode());
		result = 37 * result
				+ (getTesttime() == null ? 0 : this.getTesttime().hashCode());
		return result;
	}

}