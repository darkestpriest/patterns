package com.cardinal.decorator.condiment;

import com.cardinal.decorator.interfaces.Beverage;
import com.cardinal.decorator.interfaces.CondimentDecorator;

/**
 * Created by maperez on 20/7/2017.
 */
public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.99 + beverage.cost();
    }
}
