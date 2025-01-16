package com.example.patientservice.controller;


import com.example.patientservice.entities.Patient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.patientservice.service.IservicePatient;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/patient")
public class PatientController {
    private IservicePatient iservicePatient;

    @GetMapping("{id}")
    public Optional<Patient> getById (@PathVariable int id){
        return iservicePatient.getPatientById(id);
    }
    @PostMapping("add")
//    @PreAuthorize("hasAuthority('SCOPE_ROLE_ADMIN')")
    public Patient add (@RequestBody Patient patient) {return iservicePatient.addPatient(patient);}

    @GetMapping("all")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ROLE_ADMIN','SCOPE_ROLE_USER')")
    public List<Patient> getallpatient () {return iservicePatient.getallpatient();}

}
