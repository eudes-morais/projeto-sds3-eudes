package com.devsuperior.eudes.desvendaseudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.eudes.desvendaseudes.entities.Sale;

// Aqui já estão implementadas TODAS as operações de banco
// Por padrão, o JPA já em um componente, logo, não precisa de nenhuma anotation
public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
