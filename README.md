# Project - Naonna (BackEnd)

![NaonnaMain](https://user-images.githubusercontent.com/77485914/170818120-0c9f8dae-4113-4ef2-8e10-0bf721acc7bd.png)  
<a href="https://naonna.netlify.app">프로젝트 바로가기</a>

### 팀원소개
<pr>

| [<img src="https://github.com/lmw7414.png" width="100px">](https://github.com/lmw7414) | [<img src="https://github.com/olzlgur.png" width="100px">](https://github.com/olzlgur) |
| :------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: |
|                          [이민우](https://github.com/lmw7414)                          |                          [이지혁](https://github.com/olzlgur)                          |

### 기술 스택
    
[![Java11](https://img.shields.io/badge/java-11-blue)](https://img.shields.io/badge/java-11-blue)  
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white">

### 프로젝트 소개

밖에서 만나는 약속을 잡을 때, 신경쓰지 않을 수 없는 중요한 요소, 날씨! GDSC KNU 1기 프로젝트 1팀에서 제작한 서비스 '나온나'에서. 약속을 잡을 위치를 지정하면, 일주일간의 날씨를 계산해서, 여러분들께 최적의 날씨를 추천해 드립니다!

### Main Feature    
    - 날짜 별, 시간대 별 날씨 정보 제공
    - 날짜 별 미세먼지 정보 제공
    - 위도, 경도 < - > 주소지 변환
    - 일자 별 날씨 점수 제공
    
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

### 사용 API
<https://openweathermap.org/api/one-call-api>  - OpenWeather API
    
<https://www.vworld.kr/dev/v4dv_geocoderguide2_s001.do> - 지오코딩 API
