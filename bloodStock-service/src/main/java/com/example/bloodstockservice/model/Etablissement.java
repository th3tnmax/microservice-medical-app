package com.example.bloodstockservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Etablissement {
    private int id;
    private String name;
    private String phone;
    private String location;
}
