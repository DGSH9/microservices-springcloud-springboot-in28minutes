package com.dgsh.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dgsh.microservices.currencyexchangeservice.bean.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveEchangeValue(
			@PathVariable String from,
			@PathVariable String to) {
		
		return new CurrencyExchange(1000L,from,to,BigDecimal.valueOf(78));
	}
}