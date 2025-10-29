package com.LifeLineHospital.Hospital.Service;



import java.util.List;

import com.LifeLineHospital.Hospital.Model.Appointment;

public interface AppoinmentService {

	Appointment saveappoinment (Appointment appointment);
	List<Appointment> getAllAppoinment (Appointment appointment);
	List<Appointment> addAppoinment();
	Appointment getAllAppoinmentId (Integer id);
	Appointment updateAppoinment (Appointment appointment);
}
