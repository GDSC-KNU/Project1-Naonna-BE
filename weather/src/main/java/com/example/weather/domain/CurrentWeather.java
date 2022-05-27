package com.example.weather.domain;


import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CurrentWeather {

    private String current_dt;

    private float current_temp;

    private String weather_main;

    private float current_humidity;

    private float score;  // 불쾌지수

    public String changeUnixTime (String timeStampStr) {
        long timeStamp = Long.parseLong(timeStampStr);
        Date date = new Date(timeStamp * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+9"));
        String formattedDate = sdf.format(date);

        return formattedDate;
    }

}









