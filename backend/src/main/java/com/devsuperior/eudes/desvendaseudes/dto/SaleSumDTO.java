package com.devsuperior.eudes.desvendaseudes.dto;

import java.io.Serializable;

import com.devsuperior.eudes.desvendaseudes.entities.Seller;

public class SaleSumDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {}

	// O agrupamento somente pelo nome não funciona no POSTGRES. É necessário o objeto
	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
