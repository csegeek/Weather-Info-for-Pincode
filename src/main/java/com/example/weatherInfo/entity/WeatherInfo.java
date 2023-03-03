package com.example.weatherInfo.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weather_info")
public class WeatherInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer pincode;

    private String  place;

    private LocalDate date;

    private double temperature;

    private int humidity;

    private int pressure;

    private double windSpeed;

    private String  description;
    
   
    
    public WeatherInfo() {

    }

    public WeatherInfo(Long id, Integer pincode, String place, LocalDate date, double temperature, int humidity,
            int pressure, double windSpeed, String description) {
        this.id = id;
        this.pincode = pincode;
        this.place = place;
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.description = description;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "WeatherInfo [id=" + id + ", pincode=" + pincode + ", date=" + date + ", temperature=" + temperature
                + ", humidity=" + humidity + ", pressure=" + pressure + ", windSpeed=" + windSpeed + ", description="
                + description + "]";
    }



}