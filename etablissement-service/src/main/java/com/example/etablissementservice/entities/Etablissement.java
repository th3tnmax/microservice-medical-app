package com.example.etablissementservice.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ApiModelProperty(notes = "The name of the Etablissement", example = "Blood Donation Center")
    private String name;
    @ApiModelProperty(notes = "The phone number of the Etablissement", example = "123-456-7890")
    private String phone;
    @ApiModelProperty(notes = "The location of the Etablissement", example = "123 Main St, Sousse")
    private String location;
}
