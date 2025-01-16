package com.example.bloodstockservice.service;
import com.example.bloodstockservice.clients.EtablissementRestClient;
import com.example.bloodstockservice.entities.BloodStock;
import com.example.bloodstockservice.model.Etablissement;
import com.example.bloodstockservice.repositories.BloodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceBlood implements IserviceBlood{
    public   BloodRepository bloodRepository;
    private final EtablissementRestClient etablissementRestClient;


    @Override
    public BloodStock addBloodStock(BloodStock bloodStock) {
        return bloodRepository.save(bloodStock);
    }

    @Override
    public List<BloodStock> getAllBloodStocks() {
        List<BloodStock> stocks = bloodRepository.findAll();
        stocks.forEach(stock -> {
            Optional<Etablissement> etablissement = etablissementRestClient.getEtablissementById(stock.getEtablissementId());
            etablissement.ifPresent(stock::setEtablissement);
        });
        return stocks;
    }

    @Override
    public Optional<BloodStock> getBloodStockById(int id) {
        return Optional.empty();
//        BloodStock stock = bloodRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("BloodStock not found with id: " + id));
//        Optional<Etablissement> etablissement = etablissementRestClient.getEtablissementById(stock.getEtablissementId());
//        etablissement.ifPresent(stock::setEtablissement);
//        return stock;
    }

    @Override
    public BloodStock updateBloodStock(int id, BloodStock updatedStock) {
        BloodStock stock = bloodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("BloodStock not found with id: " + id));
        stock.setBloodType(updatedStock.getBloodType());
        stock.setQuantity(updatedStock.getQuantity());
        stock.setEtablissementId(updatedStock.getEtablissementId());
        return bloodRepository.save(stock);
    }
}
