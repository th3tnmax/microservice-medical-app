package com.example.medecinservice.service;

import com.example.medecinservice.entities.Medecin;
import com.example.medecinservice.repository.MedecinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceMedecin implements IserviceMedecin{
    public MedecinRepository medecinRepository;
    public Medecin addMedecin(Medecin medecin){
        return medecinRepository.save(medecin);
    }
    public List<Medecin> getallmedecin(){
        return medecinRepository.findAll();
    }
    public Optional<Medecin> getMedecinById(int id) {
        return medecinRepository.findById(id);
    }
}
