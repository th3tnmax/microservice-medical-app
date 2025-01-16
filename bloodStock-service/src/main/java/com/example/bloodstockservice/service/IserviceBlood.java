package com.example.bloodstockservice.service;
import com.example.bloodstockservice.entities.BloodStock;

import java.util.List;
import java.util.Optional;
public interface IserviceBlood {
    public BloodStock addBloodStock(BloodStock bloodStock);
    public List<BloodStock> getAllBloodStocks();
    public Optional<BloodStock> getBloodStockById(int id);
    public BloodStock updateBloodStock(int id, BloodStock bloodStock);
}

