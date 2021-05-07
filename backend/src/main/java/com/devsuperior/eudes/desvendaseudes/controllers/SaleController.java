package com.devsuperior.eudes.desvendaseudes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.eudes.desvendaseudes.dto.SaleDTO;
import com.devsuperior.eudes.desvendaseudes.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) { // Lembrando que está sendo feita a paginação
		Page<SaleDTO> list = service.findAll(pageable);
		
		return ResponseEntity.ok(list); // No corpo da resposta virá a lista
	}
}
