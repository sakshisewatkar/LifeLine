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
	
	@GetMapping("/all")
	public List<MedicalRecord> getAllRecords(){
		return medicalReportServiceIMPL.getAllRecords();		
	}
	
	@PutMapping("/update")
	public MedicalRecord updateRecord (@RequestBody MedicalRecord medicalRecord) {
		return medicalReportServiceIMPL.updateRecord(medicalRecord);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteRecord(@PathVariable int id) {
		return medicalReportServiceIMPL.deleteRecord(id);
	}
	
	@PatchMapping("updateDiagnosis/{id}")
	public MedicalRecord updateDiagnosis(@PathVariable int id ,@RequestBody String diagnosis ) {
		return medicalReportServiceIMPL.updateDiagnosis(id,diagnosis);
	}
	
	
	

}
