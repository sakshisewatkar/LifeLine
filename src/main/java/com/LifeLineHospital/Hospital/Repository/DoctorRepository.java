package com.LifeLineHospital.Hospital.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.LifeLineHospital.Hospital.Model.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	//Optional<Doctor> findByDoctorname(String doctorname);
	
	List<Doctor> findBySpecialization(String specialization);
	
	List<Doctor> findByExperienceYears(Integer experienceYears);
	

	
	@Query("SELECT x FROM Doctor x WHERE LOWER(x.doctorname) LIKE LOWER(CONCAT('%', :doctorname, '%'))")
	List<Doctor> findByDoctorname(@Param("doctorname") String doctorname);
	

}
