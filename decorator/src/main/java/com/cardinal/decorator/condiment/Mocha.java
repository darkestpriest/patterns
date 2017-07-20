package com.cardinal.decorator.condiment;

import com.cardinal.decorator.interfaces.Beverage;
import com.cardinal.decorator.interfaces.CondimentDecorator;

/**
 * Created by maperez on 20/7/2017.
 */
public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
