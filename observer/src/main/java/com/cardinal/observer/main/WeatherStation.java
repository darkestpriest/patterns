package com.cardinal.observer.main;

import com.cardinal.observer.data.WeatherData;
import com.cardinal.observer.display.CurrentConditionsDisplay;
import com.cardinal.observer.display.ForecastDisplay;
import com.cardinal.observer.display.StatisticsDisplay;

/**
 * Created by maperez on 20/7/2017.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
