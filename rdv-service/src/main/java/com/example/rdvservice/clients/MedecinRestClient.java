package com.example.rdvservice.clients;

import com.example.rdvservice.model.Medecin;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "MEDECIN-SERVICE")
public interface MedecinRestClient {
    @GetMapping("/api/medecin/{id}")
    Optional<Medecin> getMedecinById(@PathVariable int id);
}
