package com.LifeLineHospital.Hospital.sServiceIMPL;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<Doctor> findbyDoctor(int id) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(id);
	}

//	@Override
//	public Optional<Doctor> findbyNames(String doctorname) {
//		
//		return doctorRepository.findByDoctorname(doctorname);
//	}

	@Override
	public List<Doctor> findbyspecialization(String specialization) {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpecialization(specialization);
	}

	@Override
	public List<Doctor> findbyexperiences(Integer experienceYears) {
		
		return doctorRepository.findByExperienceYears(experienceYears);
	}

	@Override
	public List<Doctor> findbySerchname(String doctorname) {
		// TODO Auto-generated method stub
		return doctorRepository.findByDoctorname(doctorname);
	}



	

}
