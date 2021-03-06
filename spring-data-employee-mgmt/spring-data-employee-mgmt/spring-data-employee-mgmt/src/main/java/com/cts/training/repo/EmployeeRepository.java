package com.cts.training.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}