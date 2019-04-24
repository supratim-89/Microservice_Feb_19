package com.supratim.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {
	ExchangeValue findByFromCurrency(String fromCurrency);
}
