package com.example.weather.interfaces;



import com.example.weather.domain.DailyWeather;
import com.example.weather.service.WeatherService;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DailyWeatherController {



    @GetMapping("/weathers/daily/{city}")
    public List<DailyWeather> getDailyWeather(@PathVariable("city") String city) throws IOException, ParseException {

        WeatherService weatherService = new WeatherService();

        return weatherService.getDailyWeatherData(city);
    }

}