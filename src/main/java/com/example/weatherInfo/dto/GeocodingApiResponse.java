package com.example.weatherInfo.dto;

public class GeocodingApiResponse {
    
    private String zip;
    private transient String name;
    private double lat;
    private double lon;
    private transient String country;

    
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLon() {
        return lon;
    }
    public void setLon(double lon) {
        this.lon = lon;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public GeocodingApiResponse(String zip, String name, double lat, double lon, String country) {
        this.zip = zip;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.country = country;
    }

    public GeocodingApiResponse() {
    }
    
    @Override
    public String toString() {
        return "GeocodingApiResponse [zip=" + zip + ", name=" + name + ", lat=" + lat + ", lon=" + lon + ", country="
                + country + "]";
    }

    
    

}
