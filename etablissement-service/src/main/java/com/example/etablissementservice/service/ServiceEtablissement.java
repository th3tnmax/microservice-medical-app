package com.example.etablissementservice.service;

import com.example.etablissementservice.entities.Etablissement;
import com.example.etablissementservice.repositories.EtablissementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ServiceEtablissement implements IserviceEtablissement{
    private final EtablissementRepository etablissementRepository;
    public Etablissement addEtablissement(Etablissement etablissement){
        return etablissementRepository.save(etablissement);
    }
    public List<Etablissement> getallEtablissement(){
        return etablissementRepository.findAll();
    }
    public Optional<Etablissement> getEtablissementById(int id) {
        return etablissementRepository.findById(id);
    }
}
