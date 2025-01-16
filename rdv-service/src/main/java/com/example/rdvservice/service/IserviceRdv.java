package com.example.rdvservice.service;

import com.example.rdvservice.entities.Rdv;

import java.util.List;

public interface IserviceRdv {
    public Rdv getRdvById(int id);
    public Rdv addRdv(Rdv rdv);
    public List<Rdv> getallRdv();
}
