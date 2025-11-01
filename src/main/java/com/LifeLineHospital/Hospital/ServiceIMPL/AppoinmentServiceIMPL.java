package com.LifeLineHospital.Hospital.ServiceIMPL;

import java.util.List;
import java.util.Optional;

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
	public Appointment updateAppoinment(Appointment appointment) {
		return appoinmentRepository.save(appointment);
	}
	
	@Override
	public Appointment updateAppoinmentID(Integer id, Integer patientid) {
		Optional<Appointment> optionalApppoinment = appoinmentRepository.findById(id);
if(optionalApppoinment.isPresent()) {
	Appointment appointment = optionalApppoinment.get();
	appointment.setPatientid(patientid);
	return appoinmentRepository.save(appointment);
} else {
	return null;
}
		
	}
	@Override
	public List<Appointment> getAllAppoinment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

	

}
