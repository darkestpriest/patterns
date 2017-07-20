package com.cardinal.factory.interfaces;

import factory.Pizza;

/**
 * Created by maperez on 20/7/2017.
 */
public abstract class PizzaStore {

    /*private final SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }*/

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
