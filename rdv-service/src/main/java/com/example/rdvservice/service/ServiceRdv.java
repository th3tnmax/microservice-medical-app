package com.example.rdvservice.service;

import com.example.rdvservice.entities.Rdv;
import com.example.rdvservice.repositories.RdvRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ServiceRdv implements IserviceRdv{
    private RdvRepository rdvRepository;

    @Override
    public Rdv getRdvById(int id) {
        return rdvRepository.findById(id).get();
    }
    public Rdv addRdv(Rdv rdv){

        Rdv rdv1 = rdvRepository.findByPatientIdAndDateRdv(rdv.getPatientId(), rdv.getDateRdv());
        Rdv rdv2 = rdvRepository.findByMedecinIdAndDateRdv(rdv.getMedecinId(), rdv.getDateRdv());
        if (rdv1 == null && rdv2 == null) {
            return rdvRepository.save(rdv);
        }
        else
            return null;
    }
    public List<Rdv> getallRdv(){
        return rdvRepository.findAll();
    }


}
