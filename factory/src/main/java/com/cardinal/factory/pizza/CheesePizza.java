package com.cardinal.factory.pizza;

import com.cardinal.factory.factory.Pizza;
import com.cardinal.factory.interfaces.PizzaIngredientFactory;

/**
 * Created by maperez on 21/7/2017.
 */
public class CheesePizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.print("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
