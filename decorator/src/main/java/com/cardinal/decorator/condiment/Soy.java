package com.cardinal.decorator.condiment;

import com.cardinal.decorator.interfaces.Beverage;
import com.cardinal.decorator.interfaces.CondimentDecorator;

/**
 * Created by maperez on 20/7/2017.
 */
public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.09 + beverage.cost();
    }
}
