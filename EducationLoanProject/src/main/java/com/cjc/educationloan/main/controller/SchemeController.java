package com.cjc.educationloan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.educationloan.main.model.Scheme;
import com.cjc.educationloan.main.service.SchemeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/scheme")
public class SchemeController {
	
	@Autowired
	private SchemeService schemeService;

	
	@PostMapping("/saveScheme")
	public ResponseEntity<String> saveScheme(@RequestBody Scheme scheme){
		String response=schemeService.save(scheme);
		if(response.equals("Saved")) {
			return new ResponseEntity<String>("Scheme Data Saved...!! ",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAllScheme")
	public ResponseEntity<List<Scheme>> getAllScheme(){
		List<Scheme> allenquiry=schemeService.getAllScheme();
		if(allenquiry != null) {
			return new ResponseEntity<List<Scheme>>(allenquiry,HttpStatus.OK);
		  }
	   else 
	     {
			return new ResponseEntity<List<Scheme>>(allenquiry,HttpStatus.NOT_FOUND);
		 }
}


}
