package com.cts.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, String>{

}

