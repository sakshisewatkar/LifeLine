package com.LifeLineHospital.Hospital.sServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LifeLineHospital.Hospital.Model.Doctor;
import com.LifeLineHospital.Hospital.Repository.DoctorRepository;
import com.LifeLineHospital.Hospital.Service.DoctorService;
@Service
public class DoctorServiceIMPL implements DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor getalldoctors(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> alldoctors() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	

}
