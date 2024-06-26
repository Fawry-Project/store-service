package com.example.store.repository;

import com.example.store.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Long> {
    List<Stock> findStockByProductCodeContainingIgnoreCase(String productCode);

}
