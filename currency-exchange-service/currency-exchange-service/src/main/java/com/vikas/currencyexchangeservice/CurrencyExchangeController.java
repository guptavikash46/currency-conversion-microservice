package com.vikas.currencyexchangeservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueService exchangeValueService;
	
	@GetMapping("/currency-exchange/{from}-{to}")
	public ExchangeValue getCurrentRate(@PathVariable String from, @PathVariable String to) {
		ExchangeValue ex = exchangeValueService.getFullInfo(from, to);
		//System.out.println("output from db: "+ex.getId());
		ex.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return ex;
	}
}
