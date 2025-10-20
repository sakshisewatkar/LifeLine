package com.LifeLineHospital.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LifeLineHospital.Hospital.Model.Appointment;
@Repository
public interface AppoinmentRepository  extends JpaRepository<Appointment, Integer>{

}
