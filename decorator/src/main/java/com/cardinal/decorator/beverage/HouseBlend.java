package com.cardinal.decorator.beverage;

import com.cardinal.decorator.interfaces.Beverage;

/**
 * Created by maperez on 20/7/2017.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
