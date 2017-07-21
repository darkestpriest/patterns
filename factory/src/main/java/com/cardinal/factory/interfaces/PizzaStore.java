package com.cardinal.factory.interfaces;

import com.cardinal.factory.factory.Pizza;

/**
 * Created by maperez on 20/7/2017.
 */
public abstract class PizzaStore {

    /*private final SimplePizzaFactory com.cardinal.factory.factory;

    public PizzaStore(SimplePizzaFactory com.cardinal.factory.factory) {
        this.com.cardinal.factory.factory = com.cardinal.factory.factory;
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
