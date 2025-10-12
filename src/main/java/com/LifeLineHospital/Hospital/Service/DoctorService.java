package com.LifeLineHospital.Hospital.Service;

import java.util.List;
import java.util.Optional;

import com.LifeLineHospital.Hospital.Model.Doctor;

public interface DoctorService {
	
	Doctor getalldoctors(Doctor doctor);
	
	List<Doctor> alldoctors();
	Optional<Doctor> findbyDoctor(int id);
	Optional<Doctor> findbyNames(String doctorname);
	
	List<Doctor> findbyspecialization(String specialization);
	
	List<Doctor> findbyexperiences (Integer experienceYears);

}
