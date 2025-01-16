package com.example.bloodstockservice.entities;

import com.example.bloodstockservice.model.Etablissement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BloodStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bloodType;
    private int quantity;

    @Transient
    private Etablissement etablissement;
    private int etablissementId;
}
