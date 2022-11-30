package com.javabydeveloper.repository;

import com.javabydeveloper.model.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonedaRepository extends JpaRepository<Moneda, Integer> {
}
