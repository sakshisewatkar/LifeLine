package com.LifeLineHospital.Hospital.sServiceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LifeLineHospital.Hospital.Model.Patient;
import com.LifeLineHospital.Hospital.Repository.PatientRepository;
import com.LifeLineHospital.Hospital.Service.PatientService;
@Service
public class PatientServiceIMPL implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getallpatient() {
		return patientRepository.findAll();
	}

	@Override
	public Patient updatepatient(Patient patient) {
		
		return patientRepository.save(patient);
	}

	@Override
	public String deletepatient(Integer id) {
		 patientRepository.deleteById(id);
		return "Record Delted Succssfully  : "+id;
	}

	@Override
	public Patient getpatientById(int id) {
		return patientRepository.findById(id).orElse(null);
	}

	@Override
	public Patient newsavePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getNewUpdate() {
		return patientRepository.findAll();
	}

	@Override
	public Patient updateName(String name, Integer id) {
		Patient patient = patientRepository.findById(id).get();
		patient.setName(name);
		return patientRepository.save(patient);
	}

	

	

	
	


}
