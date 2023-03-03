package com.example.weatherInfo.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.weatherInfo.entity.WeatherInfo;

@Repository
public interface WeatherInfoRepository extends JpaRepository<WeatherInfo,Long>{
   Optional<WeatherInfo> findByPincodeAndDate(Integer pincode,LocalDate date);
}
