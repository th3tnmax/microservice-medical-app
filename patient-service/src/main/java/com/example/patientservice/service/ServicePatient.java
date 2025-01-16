package com.example.patientservice.service;

import com.example.patientservice.entities.Patient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.patientservice.repositories.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicePatient implements IservicePatient{
    private PatientRepository patientRepository;
    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }
    public List<Patient> getallpatient(){
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientById(int id) {
        return patientRepository.findById(id);
    }

}
