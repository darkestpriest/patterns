package com.cardinal.factory.factory.ch;

import com.cardinal.factory.interfaces.PizzaIngredientFactory;
import com.cardinal.factory.interfaces.PizzaStore;
import com.cardinal.factory.factory.Pizza;
import com.cardinal.factory.interfaces.Store;
import com.cardinal.factory.pizza.CheesePizza;
import com.cardinal.factory.pizza.ClamPizza;
import com.cardinal.factory.pizza.VeggiePizza;

import static com.cardinal.factory.enums.PizzaType.*;

/**
 * Created by maperez on 20/7/2017.
 */
@Store(enabled = true)
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equals(CHEESE.toString())) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(type);
            return pizza;
        }
        if(type.equals(VEGGIE.toString())) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(type);
            return pizza;
        }
        if(type.equals(CLAMS.toString())) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName(type);
            return pizza;
        }
        return null;
    }
}
