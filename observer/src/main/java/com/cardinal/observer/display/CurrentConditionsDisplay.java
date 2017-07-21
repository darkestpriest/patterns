package com.cardinal.observer.display;

import com.cardinal.observer.interfaces.DisplayElement;
import com.cardinal.observer.interfaces.Observer;
import com.cardinal.observer.interfaces.Subject;

/**
 * Created by maperez on 20/7/2017.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        Subject weatherData1 = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("CC: temperature = " + temperature + ", humidity = " + humidity);
    }
}
