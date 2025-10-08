package com.LifeLineHospital.Hospital.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalRecordController {
	@GetMapping("/AllReport")
	public List<String> GetMedicalReport()
	{
		return Arrays.asList(
				
				"Rani pande  12-10-2025 Blood-Test",
				"Manoj Tiwari 10-10-2025 MR Report",
				"Priyanka joshi 13-10-2025 Urine-Report" );
				
				
	}

}
