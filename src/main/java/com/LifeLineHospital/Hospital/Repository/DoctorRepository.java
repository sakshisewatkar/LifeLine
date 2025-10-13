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
	@Query("SELECT x FROM Doctor x WHERE x.specialization LIKE CONCAT('%', :specialization, '%')")
	List<Doctor> findBySpecialization(String specialization);
	
	
	@Query("SELECT x FROM Doctor x WHERE x.experienceYears >=  :experienceYears ")
	List<Doctor> findByExperienceYears(@Param("experienceYears") Integer experienceYears);
	

	
	//@Query("SELECT x FROM Doctor x WHERE LOWER(x.doctorname) LIKE LOWER(CONCAT('%', :doctorname, '%'))")
	@Query("SELECT x FROM Doctor x WHERE x.doctorname LIKE CONCAT('%', :doctorname, '%')")
	List<Doctor> findByDoctorname(@Param("doctorname") String doctorname);
	

	

}
