package com.cardinal.observer.data;

import com.cardinal.observer.interfaces.Observer;
import com.cardinal.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maperez on 20/7/2017.
 */
public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(
                observer ->
                        observer.update(temperature, humidity, pressure)
        );
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(
            final float temperature,
            final float humidity,
            final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
