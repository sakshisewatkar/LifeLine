package com.LifeLineHospital.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
//PostMethod
@PostMapping("/add")
public Patient addpatient (@RequestBody Patient patient) {
	return patientServiceIMPL.savePatient(patient);
}
//Get method
@GetMapping("/all")
public List<Patient> getAllPatient(){
	return patientServiceIMPL.getallpatient();
}
//Put Method
@PutMapping("/update")
public Patient updatedPatient(@RequestBody Patient patient) {
	return patientServiceIMPL.updatepatient(patient);
}
//Delete Method
@DeleteMapping("/delete/{id}")
public String deletepatient (@PathVariable Integer id) {
	return patientServiceIMPL.deletepatient(id);
}

@PatchMapping("/updateName/{id}")
public Patient updateName (@PathVariable Integer id , @RequestBody String name) {
	return patientServiceIMPL.updateName(name, id);
}

	

}
