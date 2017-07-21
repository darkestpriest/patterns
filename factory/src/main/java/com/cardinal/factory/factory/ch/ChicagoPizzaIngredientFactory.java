package com.cardinal.factory.factory.ch;

import com.cardinal.factory.ingredient.Garlic;
import com.cardinal.factory.ingredient.Onion;
import com.cardinal.factory.ingredient.RedPepper;
import com.cardinal.factory.ingredient.ch.*;
import com.cardinal.factory.interfaces.*;

/**
 * Created by maperez on 21/7/2017.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new PecorinoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = new Veggie[] { new Garlic(), new Onion(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniPiece();
    }

    @Override
    public Clams createClams() {
        return new FriedClams();
    }
}
