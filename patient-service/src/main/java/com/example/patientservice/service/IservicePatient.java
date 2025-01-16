package com.example.patientservice.service;


import com.example.patientservice.entities.Patient;

import java.util.List;
import java.util.Optional;

public interface IservicePatient {
    public Patient addPatient(Patient patient);

    public List<Patient> getallpatient();

    public Optional<Patient> getPatientById(int id);
}
