package com.LifeLineHospital.Hospital.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LifeLineHospital.Hospital.Model.Patient;

@RestController
public class PatientController {
	@GetMapping("/allpatient")
	public String lifeline(){
		return "Welcome to LIFELINE Hospital";
	}

}
