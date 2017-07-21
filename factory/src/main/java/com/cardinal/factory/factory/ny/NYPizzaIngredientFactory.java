package com.cardinal.factory.factory.ny;

import com.cardinal.factory.ingredient.Garlic;
import com.cardinal.factory.ingredient.Mushroom;
import com.cardinal.factory.ingredient.Onion;
import com.cardinal.factory.ingredient.RedPepper;
import com.cardinal.factory.ingredient.ny.*;
import com.cardinal.factory.interfaces.*;

/**
 * Created by maperez on 21/7/2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
