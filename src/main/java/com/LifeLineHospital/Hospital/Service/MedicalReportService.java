package com.LifeLineHospital.Hospital.Service;

import java.util.List;

import com.LifeLineHospital.Hospital.Model.MedicalRecord;

public interface MedicalReportService {
	//add --> postmapping 
	MedicalRecord addRecord(MedicalRecord medicalRecord);
	
	//read ---> get mapping 
public List<MedicalRecord> getAllRecords();

MedicalRecord updateRecord (MedicalRecord medicalRecord);

String deleteRecord(int id);

MedicalRecord updateDiagnosis (int id , String diagnosis);
}
