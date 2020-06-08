package com.example.equitypositions.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.equitypositions.model.EPTransaction;

public interface EPTransactionRepository extends CrudRepository<EPTransaction, Integer> {	

}
