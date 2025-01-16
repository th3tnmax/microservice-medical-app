package com.example.donationeventservice.service;

import com.example.donationeventservice.entities.DonationEvent;

import java.util.List;

public interface IserviceDonationEvent {

    public List<DonationEvent> getAllDonationEvents();
    public DonationEvent getDonationEventById(int id);
    public DonationEvent addDonationEvent(DonationEvent donationEvent);
}
