package com.scb.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.scb.model.Employeentity;

@RestController
@RequestMapping("/getConsumers")
public class EmployeeController {
	//@Autowired
	//EmployeeService employeeService;
	
		@GetMapping
	    public ResponseEntity<List<Employeentity>> getAllEmployees() {
	       // List<Employeentity> list = employeeService.getAllEmployees();
			final String uri = "http://localhost:8081/employee";
		     
		    RestTemplate restTemplate = new RestTemplate();
		    List<Employeentity>  list = restTemplate.getForObject(uri, List.class);
	        return new ResponseEntity<List<Employeentity>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
		 
}
