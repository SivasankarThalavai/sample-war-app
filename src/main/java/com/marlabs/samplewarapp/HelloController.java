package com.marlabs.samplewarapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private AppProperties appProperties;

	@GetMapping("/hello")
	public Map<String, String> getAppDetails() {
		Map<String, String> appDetails = new HashMap<>();
		appDetails.put("name", appProperties.getName());
		appDetails.put("description", appProperties.getDescription());

		return appDetails;
	}

}
