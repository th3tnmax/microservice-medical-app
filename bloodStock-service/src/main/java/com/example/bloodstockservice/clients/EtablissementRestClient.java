package com.example.bloodstockservice.clients;

import com.example.bloodstockservice.model.Etablissement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "ETABLISSEMENT-SERVICE")

public interface EtablissementRestClient {
    @GetMapping("/api/etablissement/{id}")
    Optional<Etablissement> getEtablissementById(@PathVariable int id);
}
