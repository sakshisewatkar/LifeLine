package com.LifeLineHospital.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LifeLineHospital.Hospital.Model.Patient;
import com.LifeLineHospital.Hospital.Service.PatientService;
import com.LifeLineHospital.Hospital.sServiceIMPL.PatientServiceIMPL;



@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientServiceIMPL patientServiceIMPL;
	
	@GetMapping("/allpatient")
	public String lifeline(){
		return "Welcome to LIFELINE Hospital";
	}
	

@PostMapping("/add")
public Patient addpatient (@RequestBody Patient patient) {
	return patientServiceIMPL.savePatient(patient);
}

@GetMapping("/all")
public List<Patient> getAllPatient(){
	return patientServiceIMPL.getallpatient();
}


	

}
