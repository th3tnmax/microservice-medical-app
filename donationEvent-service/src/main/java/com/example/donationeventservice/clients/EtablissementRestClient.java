package com.example.donationeventservice.clients;

import com.example.donationeventservice.model.Etablissement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "ETABLISSEMENT-SERVICE")

public interface EtablissementRestClient {
    @GetMapping("/api/etablissement/{id}")
    Optional<Etablissement> getEtablissementById(@PathVariable int id);
}
