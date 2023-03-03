package com.example.weatherInfo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.weatherInfo.entity.WeatherInfo;
import com.example.weatherInfo.service.WeatherService;

@RestController
public class WeatherInfoController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/weather")
    public ResponseEntity<WeatherInfo> getWeatherInfo(@RequestParam Integer pincode,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate for_date) {

        WeatherInfo weatherInfo = null;

        try {
            weatherInfo = this.weatherService.getWeatherInfo(pincode, for_date);
        }

        catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(weatherInfo);
    }

}
