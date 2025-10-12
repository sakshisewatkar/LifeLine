package com.LifeLineHospital.Hospital.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
