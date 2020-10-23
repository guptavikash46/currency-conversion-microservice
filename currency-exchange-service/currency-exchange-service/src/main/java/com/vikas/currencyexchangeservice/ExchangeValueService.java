package com.vikas.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeValueService {

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    public ExchangeValue getFullInfo(String from , String to) {
        return exchangeValueRepository.getArowByFromAndTo(from, to);
    }

}
