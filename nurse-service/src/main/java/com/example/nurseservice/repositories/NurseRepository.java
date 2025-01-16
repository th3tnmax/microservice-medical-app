package com.example.nurseservice.repositories;

import com.example.nurseservice.entities.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface NurseRepository extends JpaRepository<Nurse, Integer> {

    Nurse findByEtablissementId(int etablissementId);
}
