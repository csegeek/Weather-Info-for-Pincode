package com.example.weatherInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.weatherInfo.entity.WeatherInfo;

@Repository
public interface WeatherInfoRepository extends JpaRepository<WeatherInfo,Long>{
       
}
