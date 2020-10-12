package com.sample.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.services.SampleService;

@RestController
@RequestMapping("sample")
public class SampleController {
	
	@Autowired
	private SampleService sampleService;

	@GetMapping("get")
	public String getSampleResponse(@RequestParam("id") int id)
	{
		return "Hello";
	}
	
	@PostMapping("post")
	public String getSampleResponse(@RequestParam("name") String name)
	{
		return sampleService.getStringValue(name);
	}
	@PostMapping("get")
	public ResponseEntity<?> getSampleResponseWithHeader(@RequestHeader("name") String name)
	{
		return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(sampleService.getStringValue(name)+". There is an error.");
	}
}
