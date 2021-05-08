package com.devsuperior.eudes.desvendaseudes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.eudes.desvendaseudes.dto.SaleSuccessDTO;
import com.devsuperior.eudes.desvendaseudes.dto.SaleSumDTO;
import com.devsuperior.eudes.desvendaseudes.entities.Sale;

// Aqui já estão implementadas TODAS as operações de banco
// Por padrão, o JPA já em um componente, logo, não precisa de nenhuma anotation
public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.devsuperior.eudes.desvendaseudes.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller") //JPQL
	List<SaleSumDTO> amountGroupBySeller();
	
	@Query("SELECT new com.devsuperior.eudes.desvendaseudes.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller") //JPQL
	List<SaleSuccessDTO> successGroupBySeller();
}
