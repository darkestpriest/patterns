package com.cardinal.decorator.beverage;

import com.cardinal.decorator.interfaces.Beverage;

/**
 * Created by maperez on 20/7/2017.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.89;
    }
}
