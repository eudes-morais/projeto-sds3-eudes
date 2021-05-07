package com.devsuperior.eudes.desvendaseudes.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.eudes.desvendaseudes.dto.SellerDTO;
import com.devsuperior.eudes.desvendaseudes.entities.Seller;
import com.devsuperior.eudes.desvendaseudes.repositories.SellerRepository;

// Componente do sistema para ser injetado em outras partes do sistema
@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList()); 
	}
}
