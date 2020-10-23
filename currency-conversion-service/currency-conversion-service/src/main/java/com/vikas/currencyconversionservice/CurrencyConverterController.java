package com.vikas.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConverterController {
    @Autowired
    private CurrencyConverterProxy currencyConverterProxy;

    @GetMapping("/currency-conversion/{from}-{to}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @RequestParam(value = "quantity") BigDecimal quantity) {
//        return new CurrencyConversionBean(1L, from, to, BigDecimal.valueOf(86.88), quantity,
//                BigDecimal.valueOf(83292.2), 0);
//        Map<String, String> uriVariables = new HashMap<>();
//        uriVariables.put("from", from);
//        uriVariables.put("to", to);
//        ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
//                "http://localhost:8000/currency-exchange/{from}-{to}", CurrencyConversionBean.class,
//                uriVariables);

        CurrencyConversionBean responseCurrency = currencyConverterProxy.getCurrentRate(from ,to);
        return new CurrencyConversionBean(responseCurrency.getId(), from, to, responseCurrency.getConversionMultiple(),
                quantity, quantity.multiply(responseCurrency.getConversionMultiple()), responseCurrency.getPort());
    }
}
