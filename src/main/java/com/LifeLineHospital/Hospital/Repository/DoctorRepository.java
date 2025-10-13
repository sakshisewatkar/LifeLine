package com.LifeLineHospital.Hospital.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.LifeLineHospital.Hospital.Model.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	//Optional<Doctor> findByDoctorname(String doctorname);
	@Query("SELECT x FROM Doctor x WHERE x.specialization LIKE CONCAT('%', :specialization, '%')")
	List<Doctor> findBySpecialization(String specialization);
	
	
	@Query("SELECT x FROM Doctor x WHERE x.experienceYears >=  :experienceYears ORDER BY x.experienceYears")
	List<Doctor> findByExperienceYears(@Param("experienceYears") Integer experienceYears);
	

	
	//@Query("SELECT x FROM Doctor x WHERE LOWER(x.doctorname) LIKE LOWER(CONCAT('%', :doctorname, '%'))")
	@Query("SELECT x FROM Doctor x WHERE x.doctorname LIKE CONCAT('%', :doctorname, '%')")
	List<Doctor> findByDoctorname(@Param("doctorname") String doctorname);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Doctor x WHERE x.doctorname = :doctorname")
	void deleteByDoctorname(@Param("doctorname") String doctorname);


	

	

}
