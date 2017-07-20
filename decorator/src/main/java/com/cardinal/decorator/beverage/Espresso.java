package com.cardinal.decorator.beverage;

import com.cardinal.decorator.interfaces.Beverage;

/**
 * Created by maperez on 20/7/2017.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
