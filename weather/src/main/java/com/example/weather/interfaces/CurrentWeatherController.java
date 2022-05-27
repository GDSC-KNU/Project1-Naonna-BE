package com.example.weather.interfaces;



import com.example.weather.domain.CurrentWeather;
import com.example.weather.service.WeatherService;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CurrentWeatherController {


    @GetMapping("/weathers/current/{city}")
    public CurrentWeather getCurrentWeather(@PathVariable("city") String city) throws IOException, ParseException {

        WeatherService weatherService = new WeatherService();

        return weatherService.getCurrentWeatherData(city);
    }
}


