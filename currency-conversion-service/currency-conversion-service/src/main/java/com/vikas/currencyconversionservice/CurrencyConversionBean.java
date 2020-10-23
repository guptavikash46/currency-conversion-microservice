package com.vikas.currencyconversionservice;


import java.math.BigDecimal;

public class CurrencyConversionBean {

    private Long id;
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal CalculatedAmount;
    private int port;

    public CurrencyConversionBean() {}

    public CurrencyConversionBean(Long id, String fromCurrency, String toCurrency,
                                  BigDecimal conversionMultiple, BigDecimal quantity,
                                  BigDecimal calculatedAmount, int port) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        CalculatedAmount = calculatedAmount;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCalculatedAmount() {
        return CalculatedAmount;
    }

    public void setCalculatedAmount(BigDecimal calculatedAmount) {
        CalculatedAmount = calculatedAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
