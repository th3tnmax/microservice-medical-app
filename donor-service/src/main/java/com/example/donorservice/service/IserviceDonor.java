package com.example.donorservice.service;

import com.example.donorservice.entities.Donor;

import java.util.List;
import java.util.Optional;

public interface IserviceDonor {
    public List<Donor> getAllDonors();
    public Optional<Donor> getDonorById(int id);
    public Donor saveDonor(Donor donor);

//    void deleteDonor(int id);

}
