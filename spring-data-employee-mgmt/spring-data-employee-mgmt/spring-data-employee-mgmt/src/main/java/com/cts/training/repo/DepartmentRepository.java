package com.cts.training.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.Department;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, String>{

}
