package com.devsuperior.sdmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.sdmeta.entities.Sale;
import com.devsuperior.sdmeta.repositories.SaleRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> FindSales() {
		return repository.findAll();
	}
}
