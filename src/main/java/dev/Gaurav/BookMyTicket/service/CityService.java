package dev.Gaurav.BookMyTicket.service;

import dev.Gaurav.BookMyTicket.model.City;
import dev.Gaurav.BookMyTicket.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(City city){
        return cityRepository.save(city);
    }

    public City saveCity(String cityName){
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }

    public boolean deleteCity(int cityId){
        cityRepository.deleteById(cityId);
        return  true;
    }

    public List<City> getAllCities(){
        List<City> city = cityRepository.findAll();
        return city;
    }

    public City getCityByName(String cityName){
        City city = cityRepository.findCityByName(cityName);
        return city;
    }

    public City getCityById(int cityId){
        return cityRepository.findById(cityId).get();
    }
}
