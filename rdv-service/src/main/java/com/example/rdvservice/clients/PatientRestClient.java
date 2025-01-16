package com.example.rdvservice.clients;


import com.example.rdvservice.model.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "PATIENT-SERVICE")
public interface PatientRestClient {
    @GetMapping("/api/patient/{id}")
    Optional<Patient> getPatientById(@PathVariable int id);
}
