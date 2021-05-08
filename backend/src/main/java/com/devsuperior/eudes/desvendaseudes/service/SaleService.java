package com.devsuperior.eudes.desvendaseudes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.eudes.desvendaseudes.dto.SaleDTO;
import com.devsuperior.eudes.desvendaseudes.dto.SaleSuccessDTO;
import com.devsuperior.eudes.desvendaseudes.dto.SaleSumDTO;
import com.devsuperior.eudes.desvendaseudes.entities.Sale;
import com.devsuperior.eudes.desvendaseudes.repositories.SaleRepository;
import com.devsuperior.eudes.desvendaseudes.repositories.SellerRepository;
// Componente do sistema para ser injetado em outras partes do sistema
@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	// Busca paginada PAGEABLE
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll(); // Busca dos vendedores e armazenagem em memória (Como sãopoucos vendedores, agiliza o processo de busca)
		Page<Sale> result = repository.findAll(pageable);
		
		return result.map(x -> new SaleDTO(x)); 
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller() {
		return repository.amountGroupBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> sucessGroupBySeller() {
		return repository.successGroupBySeller();
	}
}
