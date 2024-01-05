package com.mentor.v1.repositories;


import com.mentor.v1.entities.LookupCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LookupCountryRepository extends JpaRepository<LookupCountry,Integer> {


}
