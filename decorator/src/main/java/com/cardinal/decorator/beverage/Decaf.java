package com.cardinal.decorator.beverage;

import com.cardinal.decorator.interfaces.Beverage;

/**
 * Created by maperez on 20/7/2017.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 2.89;
    }
}
