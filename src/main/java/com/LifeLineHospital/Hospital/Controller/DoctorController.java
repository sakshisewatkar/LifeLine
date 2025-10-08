package com.LifeLineHospital.Hospital.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	@GetMapping("/allReport")
	public List<String> GetMedicalReport()
	{
		return Arrays.asList(
			"Report 1: x-ray",
			"Report 2; Blood-Test",
			"Report 3: MR"
				);
	}
}
