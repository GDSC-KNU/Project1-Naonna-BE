# Project - Naonna (BackEnd)

### 팀원소개
<pr>

| [<img src="https://github.com/lmw7414.png" width="100px">](https://github.com/lmw7414) | [<img src="https://github.com/olzlgur.png" width="100px">](https://github.com/olzlgur) |
| :------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: |
|                          [이민우](https://github.com/lmw7414)                          |                          [이지혁](https://github.com/olzlgur)                          |

### 기술 스택
    
[![Java11](https://img.shields.io/badge/java-11-blue)](https://img.shields.io/badge/java-11-blue)  
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white">

### Main Feature    
    
### Structure
```
├── gradle
├── build
├── gradle/wrapper
└── src/main/.../weather
    ├── domain
    │   ├── CurrentWeather.java
    │   ├── DailyDust.java
    │   ├── DailyWeather.java
    │   ├── GeoAddress.java
    │   ├── HourlyWeather.java
    │   └── ScoreFilter.java
    ├── filter
    │   ├── CorsFilter.java
    ├── interface
    │   ├── CurrentWeatherController.java
    │   ├── DailyWeatherController.java
    │   ├── DustController.java
    │   ├── GeoController.java
    │   ├── HourlyWeatherController.java
    │   └── ScoreController.java
    ├── service
    │   ├── ScoreService.java
    │   └── WeatherService.java
    └── WeatherApplication.java
```
