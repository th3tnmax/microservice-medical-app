package com.example.bloodstockservice.repositories;

import com.example.bloodstockservice.entities.BloodStock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BloodRepository extends JpaRepository<BloodStock, Integer> {
//    List<BloodStock> findByEtablissementId(int etablissementId);
}
