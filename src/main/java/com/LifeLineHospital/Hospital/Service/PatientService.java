package com.LifeLineHospital.Hospital.Service;

import java.util.List;
import java.util.Optional;

import com.LifeLineHospital.Hospital.Model.Patient;

public interface PatientService {
	Patient savePatient (Patient patient);
	
	List<Patient> getallpatient();
	
	Patient updatepatient(Patient patient);
	
	String deletepatient(Integer id);

}
