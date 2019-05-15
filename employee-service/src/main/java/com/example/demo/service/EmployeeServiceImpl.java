package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.modal.Employee;
import com.example.demo.modal.Telephone;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee) {
		
		for (Telephone telephone : employee.getTelephones()) {
			telephone.setEmployee(employee);
		}
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployee(Employee employee) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
		if(optionalEmployee.isPresent()) {
			return optionalEmployee.get();
		}
		else {
			return null;
		}
	}
}