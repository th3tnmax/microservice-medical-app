package com.example.rdvservice.repositories;

import com.example.rdvservice.entities.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface RdvRepository extends JpaRepository<Rdv, Integer> {
    Rdv findByPatientIdAndDateRdv(int patientId, LocalDateTime dateRdv);

    Rdv findByMedecinIdAndDateRdv(int medecinId, LocalDateTime dateRdv);
}
