package com.cardinal.decorator.interfaces;

/**
 * Created by maperez on 20/7/2017.
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
