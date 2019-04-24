package com.supratim.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal conversionMultiple;
	private int port;
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return fromCurrency;
	}
	public void setFrom(String from) {
		this.fromCurrency = from;
	}
	public String getTo() {
		return toCurrency;
	}
	public void setTo(String to) {
		this.toCurrency = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple, int port) {
		super();
		this.id = id;
		this.fromCurrency = from;
		this.toCurrency = to;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
	}
	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
