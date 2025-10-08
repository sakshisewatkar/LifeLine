package com.LifeLineHospital.Hospital.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
	@GetMapping("/AllAppointment")
	public List<String> GetAppointment()
	{
		return Arrays.asList(
				"Appointment NO 1 : 08-10-2025 10.30Am",
				  "Appointment No 2 : 09-10-2025 03.00Pm",
				  "Appointment 3: 2025-10-09 02:00 PM");
				
	}

}
