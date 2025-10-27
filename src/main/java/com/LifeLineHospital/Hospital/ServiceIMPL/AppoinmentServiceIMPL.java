package com.LifeLineHospital.Hospital.ServiceIMPL;

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

	

}
