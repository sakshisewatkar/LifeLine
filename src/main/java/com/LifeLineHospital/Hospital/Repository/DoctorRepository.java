package com.LifeLineHospital.Hospital.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LifeLineHospital.Hospital.Model.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	Optional<Doctor> findByDoctorname(String doctorname);
	

}
