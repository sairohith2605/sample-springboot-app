package com.sample.demo.components;

import java.util.Base64;

import org.springframework.stereotype.Component;

@Component
public class UtilityComponent {
	
	public String getEncodedString(String plainText) {
		return Base64.getEncoder().encodeToString(plainText.getBytes());
	}

}
