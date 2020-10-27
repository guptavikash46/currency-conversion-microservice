package com.vikas.currencyexchangeservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/currency-exchange/{from}-{to}")
	public ExchangeValue getCurrentRate(@PathVariable String from, @PathVariable String to) {
		ExchangeValue ex = exchangeValueService.getFullInfo(from, to);
		//System.out.println("output from db: "+ex.getId());
		ex.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		logger.info("{}", ex);
		return ex;
	}
}
