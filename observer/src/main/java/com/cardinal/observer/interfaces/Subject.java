package com.cardinal.observer.interfaces;

/**
 * Created by maperez on 20/7/2017.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
