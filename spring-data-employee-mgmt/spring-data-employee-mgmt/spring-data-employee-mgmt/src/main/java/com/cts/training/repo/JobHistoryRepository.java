package com.cts.training.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.JobHistory;
import com.cts.training.entity.JobHistoryId;



@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryId>{

}
