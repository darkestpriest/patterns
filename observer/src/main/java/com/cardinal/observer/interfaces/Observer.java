package com.cardinal.observer.interfaces;

/**
 * Created by maperez on 20/7/2017.
 */
public interface Observer {
    void update(
            final float temp,
            final float humidity,
            final float pressure);
}
