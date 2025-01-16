package com.example.rdvservice.entities;

import com.example.rdvservice.model.Medecin;
import com.example.rdvservice.model.Patient;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rdv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime dateRdv;
    private String etat ;

    @Transient
    private Patient patient;
    private int patientId;
    @Transient
    private Medecin medecin;
    private int medecinId;
}
