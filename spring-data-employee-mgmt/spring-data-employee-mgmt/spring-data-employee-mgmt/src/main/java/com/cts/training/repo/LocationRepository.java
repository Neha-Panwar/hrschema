package com.cts.training.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.Location;



@Repository
public interface LocationRepository extends JpaRepository<Location, String>{

}