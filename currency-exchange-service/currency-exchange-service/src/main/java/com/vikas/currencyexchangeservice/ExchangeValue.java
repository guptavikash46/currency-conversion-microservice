package com.vikas.currencyexchangeservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "exchange_value")
public class ExchangeValue {

	@Id
	private Long id;
	@Column(name = "from_currency")
	private String fromCurrency;
	@Column(name = "to_currency")
	private String toCurrency;
	private BigDecimal conversionMultiple;
	private int port;
	
	public ExchangeValue() {}
	
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.fromCurrency = from;
		this.toCurrency = to;
		this.conversionMultiple = conversionMultiple;
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

	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
