package com.LifeLineHospital.Hospital.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LifeLineHospital.Hospital.Model.Appointment;
import com.LifeLineHospital.Hospital.ServiceIMPL.AppoinmentServiceIMPL;

@RestController
@RequestMapping("/appoinment")
public class AppoinmentController {

	@Autowired
	AppoinmentServiceIMPL appoinmentServiceIMPL;
	
	@PostMapping("/add")
	public Appointment addAppoinment(@RequestBody Appointment appointment) {
		return appoinmentServiceIMPL.saveappoinment(appointment);
	}
	
	
}
