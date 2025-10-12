package com.LifeLineHospital.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LifeLineHospital.Hospital.Model.Appointment;

public interface AppoinmentRepository  extends JpaRepository<Appointment, Integer>{

}
