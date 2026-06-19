package com.telidu.rest;

import org.springframework.beans.factory.annotation.Autowired;

import com.telidu.service.ITouristService;

public class TouristController {
	private ITouristService service;
	
	@Autowired
	public void setService(ITouristService service) {
		this.service=service;
	}

}
