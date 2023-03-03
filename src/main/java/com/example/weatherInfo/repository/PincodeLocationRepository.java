package com.example.weatherInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.weatherInfo.entity.PincodeLocation;
@Repository
public interface PincodeLocationRepository extends JpaRepository<PincodeLocation,Integer> {

}
