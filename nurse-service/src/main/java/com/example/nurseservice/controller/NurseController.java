package com.example.nurseservice.controller;

import com.example.nurseservice.clients.EtablissementRestClient;
import com.example.nurseservice.entities.Nurse;
import com.example.nurseservice.model.Etablissement;
import com.example.nurseservice.service.IserviceNurse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@AllArgsConstructor
@RequestMapping("/api/nurse")

public class NurseController {
    private final   IserviceNurse iserviceNurse;
    private EtablissementRestClient etablissementRestClient;

    @GetMapping("{id}")
    public Optional<Nurse> getById (@PathVariable int id){
        return iserviceNurse.getnurseById(id);
    }
    @PostMapping("add")
    public ResponseEntity<Object> add (@RequestBody Nurse nurse) {
        Nurse nurse1=null;
        Optional<Etablissement> etablissement = etablissementRestClient.getEtablissementById(nurse.getEtablissementId());
        if(etablissement.isPresent()){
            nurse1 =iserviceNurse.addnurse(nurse);
        }if(nurse1!=null){
            return new ResponseEntity<>(nurse, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<> ("merci de vérifier vos données", HttpStatus.CREATED);
        }
//        return iserviceNurse.addnurse(nurse);
    }
    @GetMapping("all")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ROLE_ADMIN','SCOPE_ROLE_USER')")
    public List<Nurse> getNurses () {
        List<Nurse> nurses = iserviceNurse.getallnurse();
        nurses.forEach(nurse -> {
            if (nurse.getEtablissementId() != 0) {
                nurse.setEtablissement(etablissementRestClient.getEtablissementById(nurse.getEtablissementId()).orElse(null));
            }
        });
        return nurses;
//        return iserviceNurse.getallnurse();
    }
}





