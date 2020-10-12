package com.sample.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.components.UtilityComponent;

@Service
public class SampleService {
	
	private final UtilityComponent component;
	
	@Autowired
	public SampleService(UtilityComponent component) {
		this.component = component;
	}

	public String getStringValue(String name) {
		return "Hello "+component.getEncodedString(name);
	}
}
