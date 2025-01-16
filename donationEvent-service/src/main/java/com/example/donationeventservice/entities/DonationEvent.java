package com.example.donationeventservice.entities;
import com.example.donationeventservice.model.Donor;
import com.example.donationeventservice.model.Etablissement;
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
public class DonationEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime dateEvent;

    private String status;


    @Transient
    private Donor donor;
    private int donorId;

    @Transient
    private Etablissement etablissement;
    private int etablissementId;

}
