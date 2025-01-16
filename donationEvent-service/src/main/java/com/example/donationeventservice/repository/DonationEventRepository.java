package com.example.donationeventservice.repository;

import com.example.donationeventservice.entities.DonationEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface DonationEventRepository extends JpaRepository<DonationEvent, Integer> {

    DonationEvent findByDonorIdAndDateEvent(int donorId, LocalDateTime dateEvent);
    DonationEvent findByEtablissementIdAndDateEvent(int establishmentId, LocalDateTime dateEvent);

}
