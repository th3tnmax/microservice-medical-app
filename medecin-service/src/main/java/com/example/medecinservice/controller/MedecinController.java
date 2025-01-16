package com.example.medecinservice.controller;

import com.example.medecinservice.entities.Medecin;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.medecinservice.service.IserviceMedecin;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/medecin")
public class MedecinController {

    private IserviceMedecin iserviceMedecin;

    @GetMapping("{id}")
    public Optional<Medecin> getById (@PathVariable int id){
        return iserviceMedecin.getMedecinById(id);
    }
    @PostMapping("add")
//    @PreAuthorize("hasAuthority('SCOPE_ROLE_ADMIN')")
    public Medecin add (@RequestBody Medecin medecin) {return iserviceMedecin.addMedecin(medecin);}

    @GetMapping("all")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ROLE_ADMIN','SCOPE_ROLE_USER')")
    public List<Medecin> getMedecin () {return iserviceMedecin.getallmedecin();}

}
