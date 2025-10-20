package com.LifeLineHospital.Hospital.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LifeLineHospital.Hospital.Model.Appointment;
import com.LifeLineHospital.Hospital.sServiceIMPL.AppoinmentServiceIMPL;

@RestController
@RequestMapping("/appoinment")
public class AppointmentController {
	@Autowired AppoinmentServiceIMPL appoinmentServiceIMPL;
	@GetMapping("/AllAppointment")
	public List<String> GetAppointment()
	{
		return Arrays.asList(
				"Appointment NO 1 : 08-10-2025 10.30Am",
				  "Appointment No 2 : 09-10-2025 03.00Pm",
				  "Appointment 3: 2025-10-09 02:00 PM");
				
	}
	
	@PostMapping("/add")
public Appointment addAppoinment (@RequestBody Appointment appointment) {
	return appoinmentServiceIMPL.saveAppoinment(appointment);
}

}
