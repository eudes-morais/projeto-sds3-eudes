package com.devsuperior.eudes.desvendaseudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.eudes.desvendaseudes.entities.Seller;

// Aqui já estão implementadas TODAS as operações de banco
// Por padrão, o JPA já em um componente, logo, não precisa de nenhuma anotation
public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
