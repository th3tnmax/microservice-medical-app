package com.example.nurseservice.entities;
import com.example.nurseservice.model.Etablissement;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ApiModelProperty(notes = "The name of the nurse", example = "John Doe")
    private String name;
    @ApiModelProperty(notes = "qualification", example = "Pediatrics")
    private String qualification;

    @Transient
    private Etablissement etablissement;
    private int etablissementId;
}
