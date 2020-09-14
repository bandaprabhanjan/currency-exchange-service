package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class currencyExchangeController {
	@Autowired
	Environment environment;
	@Autowired
	private CurExchangeRepository repository;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue currencyexchange = repository.findByFromAndTo(from, to);
		logger.info("Currency Exchange Service Without Port Number->{}", currencyexchange);
		currencyexchange.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return currencyexchange;

	}

}
