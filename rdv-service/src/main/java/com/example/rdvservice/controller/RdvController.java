package com.example.rdvservice.controller;

import com.example.rdvservice.clients.MedecinRestClient;
import com.example.rdvservice.clients.PatientRestClient;
import com.example.rdvservice.entities.Rdv;
import com.example.rdvservice.model.Medecin;
import com.example.rdvservice.model.Patient;
import com.example.rdvservice.service.IserviceRdv;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/rdv")
public class RdvController {
    private IserviceRdv iserviceRdv ;
    private MedecinRestClient medecinRestClient;
    private PatientRestClient patientRestClient;
    @PostMapping("add")
//    @PreAuthorize("hasAuthority('SCOPE_ROLE_ADMIN')")
    public ResponseEntity<Object> add (@RequestBody Rdv rdv) {
        Rdv rdv1=null;
        Optional<Patient> patient = patientRestClient.getPatientById(rdv.getPatientId());
        Optional<Medecin> medecin = medecinRestClient.getMedecinById(rdv.getMedecinId());
        if(patient.isPresent() && medecin.isPresent()){
            rdv1 = iserviceRdv.addRdv (rdv);
        }
        if(rdv1!=null){
            return new ResponseEntity<>(rdv, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<> ("Le Rdv ne peut pas être crée, merci de vérifier vos données", HttpStatus.CREATED);
        }

//        return iserviceRdv.addRdv(rdv);
    }

    @GetMapping("all")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ROLE_ADMIN','SCOPE_ROLE_USER')")
    public List<Rdv> allRdv () {
        List<Rdv> rdvs = iserviceRdv.getallRdv();
        rdvs.forEach(rdv -> {
            if (rdv.getPatientId() != 0) {
                rdv.setPatient(patientRestClient.getPatientById(rdv.getPatientId()).orElse(null));

            }
            if (rdv.getMedecinId() != 0) {
                rdv.setMedecin(medecinRestClient.getMedecinById(rdv.getMedecinId()).orElse(null));
            }
        });

//        return iserviceRdv.getallRdv();
            return rdvs;
    }

    @GetMapping("{id}")
    public Rdv getById(@PathVariable int id) {
        Rdv rdv = iserviceRdv.getRdvById(id);
        Optional<Patient> patient = patientRestClient.getPatientById(rdv.getPatientId());
        Optional<Medecin> medecin = medecinRestClient.getMedecinById(rdv.getMedecinId());
        rdv.setPatient(patient.get());
        rdv.setMedecin(medecin.get());
        return rdv;
    }
}
