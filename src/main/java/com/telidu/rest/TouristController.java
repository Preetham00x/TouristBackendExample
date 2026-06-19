package com.telidu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telidu.model.Tourist;
import com.telidu.service.ITouristService;

public class TouristController {
	private ITouristService service;
	
	@Autowired
	public void setService(ITouristService service) {
		this.service=service;
	}
	@PostMapping()
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
		String res=service.registerTourist(tourist);
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
		
	}
	@GetMapping("/get-tourist/{id}")
    public ResponseEntity<?> getTourist(@PathVariable("id") Integer id){
    	try {
    		Tourist tourist = service.fetchTouristById(id);
    		return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
    		
    	}catch(Exception e) {
    		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
    		
    	}
    }
	public ResponseEntity<String> updateTourist(@PathVariable("id") Integer id){
		try {
		String res=service.deleteTouristInfoById(id);
		return new ResponseEntity<String >(res,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
}
