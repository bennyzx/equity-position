package com.example.equitypositions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.equitypositions.service.EPTransactionService;

@RestController
public class EPTransactionController {

	@Autowired
	private EPTransactionService epTransactionService;
	
	public void insert() {
		
	}

	public void update() {
		
	}
	
	public void cancel() {
		
	}
}

