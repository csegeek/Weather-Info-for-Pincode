package com.example.weatherInfo.controller;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.example.weatherInfo.entity.WeatherInfo;
import com.example.weatherInfo.service.WeatherService;

@AutoConfigureMockMvc
@ContextConfiguration
@SpringBootTest
public class ControllerMockMvcTests {
    @Autowired
    private MockMvc mockMvc;
    @Mock
    private WeatherService weatherService;
    @InjectMocks
    private WeatherInfoController weatherInfoController;

    @BeforeEach
    public void setUp(){
        mockMvc=MockMvcBuilders.standaloneSetup(weatherInfoController).build();   
    }

    @Test
    public void testgetWeatherInfo() throws Exception{
        Integer pincode =411014 ;
        LocalDate for_date = LocalDate.parse("2023-03-02");
        WeatherInfo expectedWeatherInfo=new WeatherInfo();
        expectedWeatherInfo.setPincode(pincode);
        expectedWeatherInfo.setPlace("XYZ");
        expectedWeatherInfo.setDate(for_date);
        expectedWeatherInfo.setTemperature(20.0);
        expectedWeatherInfo.setHumidity(50);
        expectedWeatherInfo.setPressure(1000);
        expectedWeatherInfo.setWindSpeed(3.46);
        expectedWeatherInfo.setDescription("clear");
        Mockito.when(weatherService.getWeatherInfo(pincode,for_date)).thenReturn(expectedWeatherInfo);
        this.mockMvc.perform(MockMvcRequestBuilders.get("/weather")
        .param("pincode",pincode.toString())
        .param("for_date",for_date.toString()))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(MockMvcResultHandlers.print())
        .andExpect(MockMvcResultMatchers.jsonPath(".pincode").value(pincode))
        .andExpect(MockMvcResultMatchers.jsonPath(".temperature").value(expectedWeatherInfo.getTemperature()))
        .andExpect(MockMvcResultMatchers.jsonPath(".humidity").value(expectedWeatherInfo.getHumidity()))
        .andExpect(MockMvcResultMatchers.jsonPath(".pressure").value(expectedWeatherInfo.getPressure()))
        .andExpect(MockMvcResultMatchers.jsonPath(".windSpeed").value(expectedWeatherInfo.getWindSpeed()))
        .andExpect(MockMvcResultMatchers.jsonPath(".description").value(expectedWeatherInfo.getDescription()))
        .andExpect(MockMvcResultMatchers.jsonPath(".place").value(expectedWeatherInfo.getPlace()));

    }


}
