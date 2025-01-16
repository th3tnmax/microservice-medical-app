package com.example.medecinservice.service;


import com.example.medecinservice.entities.Medecin;

import java.util.List;
import java.util.Optional;

public interface IserviceMedecin {

    public Medecin addMedecin(Medecin medecin);

    public List<Medecin> getallmedecin();
    public Optional<Medecin> getMedecinById(int id);

}
