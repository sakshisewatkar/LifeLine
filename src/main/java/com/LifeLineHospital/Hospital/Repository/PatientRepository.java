package com.LifeLineHospital.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LifeLineHospital.Hospital.Model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
