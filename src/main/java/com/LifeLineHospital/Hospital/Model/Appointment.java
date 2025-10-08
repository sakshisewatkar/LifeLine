package com.LifeLineHospital.Hospital.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id ;
	private Integer patientid ;
	private Integer doctorid ;
	private Date appointmentdate;
	private String status ;
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patientid=" + patientid + ", doctorid=" + doctorid + ", appointmentdate="
				+ appointmentdate + ", status=" + status + ", getId()=" + getId() + ", getPatientid()=" + getPatientid()
				+ ", getDoctorid()=" + getDoctorid() + ", getAppointmentdate()=" + getAppointmentdate()
				+ ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPatientid() {
		return patientid;
	}
	public void setPatientid(Integer patientid) {
		this.patientid = patientid;
	}
	public Integer getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(Integer doctorid) {
		this.doctorid = doctorid;
	}
	public Date getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(Date appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
