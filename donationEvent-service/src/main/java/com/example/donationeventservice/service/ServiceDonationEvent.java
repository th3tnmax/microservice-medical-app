package com.example.donationeventservice.service;

import com.example.donationeventservice.clients.DonorRestClient;
import com.example.donationeventservice.clients.EtablissementRestClient;
import com.example.donationeventservice.entities.DonationEvent;
import com.example.donationeventservice.repository.DonationEventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceDonationEvent implements IserviceDonationEvent{
    private DonationEventRepository EventRepository;


    @Override
    public List<DonationEvent> getAllDonationEvents() {
        return EventRepository.findAll();
    }

    @Override
    public DonationEvent getDonationEventById(int id) {
        return EventRepository.findById(id).get();
    }

    @Override
    public DonationEvent addDonationEvent(DonationEvent donationEvent) {

        DonationEvent de1 = EventRepository.findByDonorIdAndDateEvent(donationEvent.getDonorId(), donationEvent.getDateEvent());
        DonationEvent de2 = EventRepository.findByEtablissementIdAndDateEvent(donationEvent.getEtablissementId(), donationEvent.getDateEvent());
        if (de1 == null && de2 == null) {
            return EventRepository.save(donationEvent);
        }
        else
            return null;
    }
}
