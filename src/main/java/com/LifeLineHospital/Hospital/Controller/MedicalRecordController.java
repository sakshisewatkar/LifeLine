package com.LifeLineHospital.Hospital.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LifeLineHospital.Hospital.Model.MedicalRecord;
import com.LifeLineHospital.Hospital.ServiceIMPL.MedicalReportServiceIMPL;

@RestController
@RequestMapping("/medicalrecord")
public class MedicalRecordController {
	@Autowired
	private MedicalReportServiceIMPL medicalReportServiceIMPL;
	
	@PostMapping("/add")
	public MedicalRecord addrecord(@RequestBody MedicalRecord medicalRecord) {
		return medicalReportServiceIMPL.addRecord(medicalRecord);
	}
	

}
