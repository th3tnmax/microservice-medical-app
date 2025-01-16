package com.example.etablissementservice.controller;

import com.example.etablissementservice.entities.Etablissement;
import com.example.etablissementservice.service.IserviceEtablissement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@AllArgsConstructor
@RequestMapping("/api/etablissement")
public class EtablissementController {

   private IserviceEtablissement iserviceEtablissement;

    @GetMapping("{id}")
    public Optional<Etablissement> getById (@PathVariable int id){
        return iserviceEtablissement.getEtablissementById(id);
    }
    @PostMapping("add")
    public Etablissement add(@RequestBody Etablissement etablissement) {
        return iserviceEtablissement.addEtablissement(etablissement);
    }
    @GetMapping("all")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ROLE_ADMIN','SCOPE_ROLE_USER')")
    public List<Etablissement> getEtablissement () {return iserviceEtablissement.getallEtablissement();}
}
