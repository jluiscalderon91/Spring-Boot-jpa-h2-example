package com.javabydeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javabydeveloper.model.TipoCambio;

@Repository
public interface TipoCambioRepository extends JpaRepository<TipoCambio, Integer>{
	
}
