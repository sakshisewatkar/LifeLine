package com.LifeLineHospital.Hospital.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MedicalRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private int patientid;
    private String diagnosis;
    private String treatment;
    private Date recorddate;
	@Override
	public String toString() {
		return "MedicalRecord [id=" + id + ", patientid=" + patientid + ", diagnosis=" + diagnosis + ", treatment="
				+ treatment + ", recorddate=" + recorddate + ", getId()=" + getId() + ", getPatientid()="
				+ getPatientid() + ", getDiagnosis()=" + getDiagnosis() + ", getTreatment()=" + getTreatment()
				+ ", getRecorddate()=" + getRecorddate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public Date getRecorddate() {
		return recorddate;
	}
	public void setRecorddate(Date recorddate) {
		this.recorddate = recorddate;
	}
	

}
