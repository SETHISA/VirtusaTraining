package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.modal.Address;
import com.example.demo.modal.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(value = "emscloud")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	
	@PostMapping("employee")
	public Employee save(@RequestBody Employee employee){
		return employeeService.save(employee);
	}

	@GetMapping("test1")
	public Employee test() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Kasun");
		Address address = new Address();
		address.setId(1);
		address.setAddress1("Debarwawe");
		address.setCity("Tissa");

		employee.setAddress(address);

		return employee;
	}

	@GetMapping("test2")
	public ResponseEntity<Employee> test1() {
		Integer x = 2;
		if (x == null) {
			Employee employee = new Employee();
			employee.setId(1);
			employee.setName("Kasun");
			Address address = new Address();
			address.setId(1);
			address.setAddress1("Debarwawe");
			address.setCity("Tissa");

			employee.setAddress(address);

			return ResponseEntity.ok(employee);
		} else {
			HttpHeaders headers = new HttpHeaders();
			headers.add("status", "invalid-ststus");
			return ResponseEntity.notFound().headers(headers).build();
		}

	}

}
