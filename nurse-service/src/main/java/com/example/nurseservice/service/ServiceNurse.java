package com.example.nurseservice.service;

import com.example.nurseservice.entities.Nurse;
import com.example.nurseservice.repositories.NurseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ServiceNurse implements IserviceNurse{
    public  NurseRepository nurseRepository;
    @Override
    public Nurse addnurse(Nurse nurse) {

        Nurse Nurse1 = nurseRepository.findByEtablissementId(nurse.getEtablissementId());
        if (Nurse1 == null) {
            return nurseRepository.save(nurse);
        }
            return null;
    }

    @Override
    public List<Nurse> getallnurse() {
        return nurseRepository.findAll();
    }

    @Override
    public Optional<Nurse> getnurseById(int id) {
        return nurseRepository.findById(id);
    }
}
