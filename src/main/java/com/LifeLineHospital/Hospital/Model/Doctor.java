package com.LifeLineHospital.Hospital.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id ;
private String doctorname ;
private String specialization ;
private Integer experienceYears ;
@Override
public String toString() {
	return "Doctor [id=" + id + ", doctorname=" + doctorname + ", specialization=" + specialization
			+ ", experienceYears=" + experienceYears + ", getId()=" + getId() + ", getDoctorname()=" + getDoctorname()
			+ ", getSpecialization()=" + getSpecialization() + ", getExperienceYears()=" + getExperienceYears()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDoctorname() {
	return doctorname;
}
public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public Integer getExperienceYears() {
	return experienceYears;
}
public void setExperienceYears(Integer experienceYears) {
	this.experienceYears = experienceYears;
}
	

	}


