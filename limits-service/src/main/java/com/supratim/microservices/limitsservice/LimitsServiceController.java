package com.supratim.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supratim.microservices.limitsservice.beans.LimitsConfiguration;

@RestController
public class LimitsServiceController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping
	public LimitsConfiguration getLimitConfiguration()
	{
		return new LimitsConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}

	
	
}
