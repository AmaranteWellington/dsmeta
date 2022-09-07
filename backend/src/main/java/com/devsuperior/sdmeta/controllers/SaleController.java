package com.devsuperior.sdmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.sdmeta.entities.Sale;
import com.devsuperior.sdmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	@Autowired
	private SaleService service;
	@GetMapping
	 public List<Sale> findSales(){
		 return service.FindSales();
	 }
}
