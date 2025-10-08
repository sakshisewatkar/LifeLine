package com.LifeLineHospital.Hospital.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id ;
	private String name ;
	private String gender ;
	private String address;
	private String Contactno ;
	private Date admissionDate ;
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", Contactno="
				+ Contactno + ", admissionDate=" + admissionDate + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + ", getContactno()="
				+ getContactno() + ", getAdmissionDate()=" + getAdmissionDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactno() {
		return Contactno;
	}
	public void setContactno(String contactno) {
		Contactno = contactno;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
}
