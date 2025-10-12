package com.LifeLineHospital.Hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LifeLineHospital.Hospital.Model.MedicalRecord;

public interface MedicalReportRepository extends JpaRepository<MedicalRecord, Integer> {

}
