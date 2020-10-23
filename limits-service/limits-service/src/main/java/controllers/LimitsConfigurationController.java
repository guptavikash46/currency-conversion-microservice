package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import configurations.LimitsValues;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitsValues limits;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitsFromConfigurations() {
		return new LimitConfiguration(limits.getMinimum(), limits.getMaximum());
	}
}
