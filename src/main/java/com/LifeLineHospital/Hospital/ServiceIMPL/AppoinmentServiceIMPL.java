package com.LifeLineHospital.Hospital.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LifeLineHospital.Hospital.Model.Appointment;
import com.LifeLineHospital.Hospital.Repository.AppoinmentRepository;
import com.LifeLineHospital.Hospital.Service.AppoinmentService;
@Service
public class AppoinmentServiceIMPL implements  AppoinmentService {
@Autowired
private AppoinmentRepository appoinmentRepository;
	@Override
	public Appointment saveappoinment(Appointment appointment) {
		return appoinmentRepository.save(appointment);
	}
	@Override
	public List<Appointment> addAppoinment() {
		return appoinmentRepository.findAll();
	}
	
	@Override
	public Appointment getAllAppoinmentId(Integer id) {
	     return appoinmentRepository.findById(id).orElse(null);
	}
	@Override
	public List<Appointment> getAllAppoinment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
