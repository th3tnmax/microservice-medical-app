package com.example.donationeventservice.clients;


import com.example.donationeventservice.model.Donor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "DONOR-SERVICE")
public interface DonorRestClient {
    @GetMapping("/api/donor/{id}")
    Optional<Donor> getDonorById(@PathVariable int id);
}
