package com.example.etablissementservice.repositories;

import com.example.etablissementservice.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRepository extends JpaRepository<Etablissement, Integer> {
}
