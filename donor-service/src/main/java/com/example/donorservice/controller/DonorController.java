package com.example.donorservice.controller;

import com.example.donorservice.entities.Donor;
import com.example.donorservice.service.IserviceDonor;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@AllArgsConstructor
@RequestMapping("/api/donor")
public class DonorController {
    private final IserviceDonor iserviceDonor;

    @GetMapping("{id}")
    public Optional<Donor> getDonorById (@PathVariable int id){
        return iserviceDonor.getDonorById(id);
    }
    @PostMapping("add")
//    @PreAuthorize("hasAuthority('SCOPE_ROLE_ADMIN')")
    public Donor saveDonor (@RequestBody Donor donor) {
        return iserviceDonor.saveDonor(donor);
    }
    @GetMapping("all")
//    @PreAuthorize("hasAnyAuthority('SCOPE_ROLE_ADMIN','SCOPE_ROLE_USER')")
    public List<Donor> getAllDonors () {
        return iserviceDonor.getAllDonors();
    }
}
