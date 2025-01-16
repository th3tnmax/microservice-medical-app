package com.example.donorservice.service;

import com.example.donorservice.entities.Donor;
import com.example.donorservice.repository.DonorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ServiceDonor implements IserviceDonor{

    private DonorRepository donorRepository;

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @Override
    public Optional<Donor> getDonorById(int id) {
        return donorRepository.findById(id);
    }

    @Override
    public Donor saveDonor(Donor donor) {
        return donorRepository.save(donor);
    }

}
