package com.example.nurseservice.service;

import com.example.nurseservice.entities.Nurse;

import java.util.List;
import java.util.Optional;

public interface IserviceNurse {

    public Nurse addnurse(Nurse nurse);

    public List<Nurse> getallnurse();
    public Optional<Nurse> getnurseById(int id);
}
