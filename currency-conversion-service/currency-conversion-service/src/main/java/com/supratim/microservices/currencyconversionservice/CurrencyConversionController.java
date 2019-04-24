package com.supratim.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.supratim.microservices.zuulapigateway.ZuulLoggingFilter;

@RestController
@EnableFeignClients("com.supratim.microservices.currencyconversionservice")
public class CurrencyConversionController {
	@Autowired
	CurrencyConversionFeignProxy proxy;
	 private org.slf4j.Logger logger=LoggerFactory.getLogger(CurrencyConversionController.class);
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public currencyConverterBean getConvertedCurrency(@PathVariable String  from,@PathVariable String to,@PathVariable BigDecimal  quantity) {
	//	return new  C(1L,from,to,BigDecimal.valueOf(65),quantity,BigDecimal.valueOf(0),0);
		Map<String,String> uriVariables=new HashMap<String,String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<currencyConverterBean> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/{from}/to/{to}", currencyConverterBean.class, uriVariables);
		currencyConverterBean response= responseEntity.getBody();
		return new currencyConverterBean(response.getId(),response.getFrom(),response.getTo(),response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()),0);
	}
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public currencyConverterBean getConvertedCurrencyfeign(@PathVariable String  from,@PathVariable String to,@PathVariable BigDecimal  quantity) {
		logger.info("inside the currency conversion controller");
		currencyConverterBean response= proxy.retrieveExchangeValue(from, to);
		return new currencyConverterBean(response.getId(),response.getFrom(),response.getTo(),response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());
	}
	
	
	

}
