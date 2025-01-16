package com.example.bloodstockservice.controller;
import com.example.bloodstockservice.entities.BloodStock;
import com.example.bloodstockservice.service.IserviceBlood;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bloodstock")
@AllArgsConstructor
public class BloodTypeController {
    private IserviceBlood iserviceBlood;

    @PutMapping("/{id}")
    public ResponseEntity<BloodStock> updateBloodStock(@PathVariable int id, @RequestBody BloodStock bloodStock) {
        BloodStock updatedStock = iserviceBlood.updateBloodStock(id, bloodStock);
        return ResponseEntity.ok(updatedStock);
    }

    @PostMapping("/add")
    public ResponseEntity<BloodStock> addBloodStock(@RequestBody BloodStock bloodStock) {
        return ResponseEntity.ok(iserviceBlood.addBloodStock(bloodStock));
    }
    @GetMapping("/all")
    public ResponseEntity<List<BloodStock>> getAllBloodStocks() {
        List<BloodStock> stocks = iserviceBlood.getAllBloodStocks();
        return ResponseEntity.ok(stocks);
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<BloodStock> getBloodStockById(@PathVariable int id) {
//         Optional<BloodStock> stock = iserviceBlood.getBloodStockById(id);
//        return new ResponseEntity<>()ResponseEntity.ok(stock);
//        return  ResponseEntity<>(stock, HttpStatus.CREATED);
//    }
}
