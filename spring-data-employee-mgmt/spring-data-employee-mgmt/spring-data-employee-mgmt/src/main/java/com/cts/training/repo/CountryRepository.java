package com.cts.training.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>{

}