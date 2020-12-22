package com.cts.training.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.Job;


@Repository
public interface JobRepository extends JpaRepository<Job, String>{

}