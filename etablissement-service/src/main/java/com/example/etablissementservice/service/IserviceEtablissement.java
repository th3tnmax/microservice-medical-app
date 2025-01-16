package com.example.etablissementservice.service;

import com.example.etablissementservice.entities.Etablissement;

import java.util.List;
import java.util.Optional;

public interface IserviceEtablissement {

    public Etablissement addEtablissement(Etablissement etablissement);

    public List<Etablissement> getallEtablissement();
    public Optional<Etablissement> getEtablissementById(int id);

}
