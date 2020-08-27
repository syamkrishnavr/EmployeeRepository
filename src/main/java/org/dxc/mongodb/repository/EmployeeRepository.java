package org.dxc.mongodb.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
