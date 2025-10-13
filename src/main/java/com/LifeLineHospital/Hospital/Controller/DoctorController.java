package com.LifeLineHospital.Hospital.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LifeLineHospital.Hospital.Model.Doctor;
import com.LifeLineHospital.Hospital.sServiceIMPL.DoctorServiceIMPL;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorServiceIMPL doctorServiceIMPL;
	
	@GetMapping("/allReport")
	public List<String> GetMedicalReport()
	{
		return Arrays.asList(
			"Report 1: x-ray",
			"Report 2; Blood-Test",
			"Report 3: MR"
				);
	}
	
	@PostMapping("/post")
	public Doctor alldoctor(@RequestBody Doctor doctor) {
		
		return doctorServiceIMPL.getalldoctors(doctor);
	}
	
	
	@GetMapping("/getalldoctor")
	public List<Doctor> getalldoc(){
		return doctorServiceIMPL.alldoctors();
	}
	
	@GetMapping("/doctor/{id}")
	public Optional<Doctor> getonedoc(@PathVariable int id){
		return doctorServiceIMPL.findbyDoctor(id);
	}
	
//	@GetMapping("/doctor/name/{doctorname}")
//	public Optional<Doctor> getonedocName(@PathVariable String doctorname){
//		return doctorServiceIMPL.findbyNames(doctorname);
//	}
	
	
	@GetMapping("/doctor/specialization/{specialization}")
	public List<Doctor> getonedocspecialization(@PathVariable String specialization){
		return doctorServiceIMPL.findbyspecialization(specialization);
	}
	
	@GetMapping("/doctor/experienceYears/{experienceYears}")
	public List<Doctor> getonedocexperiences(@PathVariable Integer experienceYears){
		return doctorServiceIMPL.findbyexperiences(experienceYears);
	}
	
	
	@GetMapping("/searchdoctor/{doctorname}")
	public List<Doctor> getonedocName(@PathVariable String doctorname){
		return doctorServiceIMPL.findbySerchname(doctorname);
	}
	
	@DeleteMapping("/doctor/name/{doctorname}")
	public Optional<Doctor> deletedbydoctor(@PathVariable String doctorname){
		return doctorServiceIMPL.deletebyname(doctorname);
	}
	
}
