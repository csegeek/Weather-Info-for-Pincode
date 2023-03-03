# Weather Info for Pincode 
 A Spring Boot Application with REST API for weather information for a particular day and a
Pincode using OpenWeather API (https://openweathermap.org/api/history-api-timestamp) and
OpenWeather GeoCoding API (https://openweathermap.org/api/geocoding-api).


### Request
`GET:  /weather` \
 `GET`  'http://localhost:8080/weather?pincode={pincode}&for_date={date}'

#### Parameters
`pincode`  required \
`date` required 

### Example of API Call
'http://localhost:8080/weather?pincode=411014&for_date=2020-10-15'
### Example of API Response 
```--data-raw 
{
    "pincode": 411014,
    "place": "Viman Nagar",
    "date": "2020-10-15",
    "temperature": 298.67,
    "humidity": 24,
    "pressure": 1017,
    "windSpeed": 0.41,
    "description": "clear sky"
}
```
### Technology
1. Java
2. Spring Boot
3. Spring Data Jpa
4. Mysql
5. Junit5 and Mockito(Unit Testing)
6. REST API
7. RestTemplate
