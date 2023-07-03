package com.trangile.prototype.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trangile.prototype.service.CountService;

@RestController
@RequestMapping("/internalCheck")
@CrossOrigin(origins = "*")
public class CheckController {
	
	@Autowired
	private CountService cService;
	
	@GetMapping(value = "/validateitem")
	public ResponseEntity<?> checkItem(@RequestParam(name = "itemNumber") String value){
		return new ResponseEntity<>(cService.getItemCount(value), HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/validatelot")
	public ResponseEntity<?> checkLOT(@RequestParam(name = "batchNumber") String value){
		return new ResponseEntity<>(cService.getLotCount(value), HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/validatessc")
	public ResponseEntity<?> checkSSC(@RequestParam(name = "sscNumber") String value){
		return new ResponseEntity<>(cService.getTNOPALCount(value), HttpStatus.OK);
	}

}
