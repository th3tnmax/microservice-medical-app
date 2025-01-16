package com.example.donationeventservice.controller;
import com.example.donationeventservice.clients.DonorRestClient;
import com.example.donationeventservice.clients.EtablissementRestClient;
import com.example.donationeventservice.entities.DonationEvent;
import com.example.donationeventservice.model.Donor;
import com.example.donationeventservice.model.Etablissement;
import com.example.donationeventservice.service.IserviceDonationEvent;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/donationevent")
public class DonationEventController {
    private IserviceDonationEvent iserviceDonationEvent;
    private DonorRestClient donorRestClient;
    private EtablissementRestClient etablissementRestClient;

    @PostMapping("add")
//    @PreAuthorize("hasAuthority('SCOPE_ROLE_ADMIN')")
    public ResponseEntity<Object> add (@RequestBody DonationEvent donationEvent) {
        DonationEvent de1=null;
        Optional<Donor> donor = donorRestClient.getDonorById(donationEvent.getDonorId());
        Optional<Etablissement> etablissement = etablissementRestClient.getEtablissementById(donationEvent.getEtablissementId());
        if(donor.isPresent() && etablissement.isPresent()){
            de1 = iserviceDonationEvent.addDonationEvent (donationEvent);
        }
        if(de1!=null){
            return new ResponseEntity<>(donationEvent, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<> ("vérifier vos données", HttpStatus.CREATED);
        }
    }

    @GetMapping("all")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ROLE_ADMIN','SCOPE_ROLE_USER')")
    public List<DonationEvent> allDonationEvent () {
        List<DonationEvent> des = iserviceDonationEvent.getAllDonationEvents();
        des.forEach(de -> {
            if (de.getDonorId() != 0) {
                de.setDonor(donorRestClient.getDonorById(de.getDonorId()).orElse(null));

            }
            if (de.getEtablissementId() != 0) {
                de.setEtablissement(etablissementRestClient.getEtablissementById(de.getEtablissementId()).orElse(null));
            }
        });


        return des;
    }
    @GetMapping("{id}")
    public DonationEvent getById(@PathVariable int id) {
        DonationEvent de = iserviceDonationEvent.getDonationEventById(id);
        Optional<Donor> donor = donorRestClient.getDonorById(de.getDonorId());
        Optional<Etablissement> etablissement = etablissementRestClient.getEtablissementById(de.getEtablissementId());
        de.setDonor(donor.get());
        de.setEtablissement(etablissement.get());
        return de;
    }
}
