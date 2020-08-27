package org.dxc.mongodb.model.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(List<Employee> employee) {
		employeeRepository.saveAll(employee);
		
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findEmployeeById(int id) {
		System.out.println(id);
		return employeeRepository.findById(id);
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

}