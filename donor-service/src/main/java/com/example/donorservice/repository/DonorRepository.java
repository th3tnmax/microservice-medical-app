package com.example.donorservice.repository;

import com.example.donorservice.entities.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Integer> {
}
