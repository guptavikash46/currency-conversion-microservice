package com.vikas.currencyconversionservice;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service")
@RibbonClient(name = "currency-exchange-service")
@EnableDiscoveryClient
public interface CurrencyConverterProxy {

    @GetMapping("/currency-exchange/{from}-{to}")
    CurrencyConversionBean getCurrentRate(@PathVariable("from") String from, @PathVariable("to") String to);
}
