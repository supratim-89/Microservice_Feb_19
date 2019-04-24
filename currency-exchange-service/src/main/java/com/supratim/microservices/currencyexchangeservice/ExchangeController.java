package com.supratim.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ExchangeController {
	@Autowired
	private Environment environment;
	
	private org.slf4j.Logger logger=LoggerFactory.getLogger(ExchangeController.class);
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	
	
	@GetMapping("currency-exchange/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)
	{    logger.info("inside the exchange Controller");
		return exchangeValueRepository.findByFromCurrency(from);
		
	}

}
