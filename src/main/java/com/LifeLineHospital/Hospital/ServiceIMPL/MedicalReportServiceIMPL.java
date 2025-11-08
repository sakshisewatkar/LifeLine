package com.LifeLineHospital.Hospital.ServiceIMPL;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.LifeLineHospital.Hospital.Model.MedicalRecord;
import com.LifeLineHospital.Hospital.Repository.MedicalReportRepository;
import com.LifeLineHospital.Hospital.Service.MedicalReportService;

@Service
public class MedicalReportServiceIMPL implements MedicalReportService {
	
@Autowired
private MedicalReportRepository medicalReportRepository;

@Override
public MedicalRecord addRecord(MedicalRecord medicalRecord) {
	return medicalReportRepository.save(medicalRecord);
}

@Override
public List<MedicalRecord> getAllRecords() {
	return medicalReportRepository.findAll();
}

@Override
public MedicalRecord updateRecord(MedicalRecord medicalRecord) {
	return medicalReportRepository.save(medicalRecord);
}

@Override
public String deleteRecord(int id) {
	medicalReportRepository.deleteById(id);
	return "medical records deleted successfully with ID" + id;
}

@Override
public MedicalRecord updateDiagnosis(int id, String diagnosis) {
	MedicalRecord medicalRecord = medicalReportRepository.findById(id).orElse(null);
	if(medicalRecord != null) {
		medicalRecord.setDiagnosis(diagnosis);
	return medicalReportRepository.save(medicalRecord);
}
return null;

	
}
}
