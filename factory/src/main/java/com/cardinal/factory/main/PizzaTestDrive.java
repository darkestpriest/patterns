package com.cardinal.factory.main;

import com.cardinal.factory.factory.Pizza;
import com.cardinal.factory.factory.ch.ChicagoPizzaStore;
import com.cardinal.factory.factory.ny.NYPizzaStore;
import com.cardinal.factory.interfaces.PizzaStore;
import com.cardinal.factory.util.ClassScanner;

import static com.cardinal.factory.enums.PizzaType.CHEESE;

/**
 * Created by maperez on 21/7/2017.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(CHEESE.toString());
        System.out.println("First pizza ordered is " + pizza);

        pizza = chicagoStore.orderPizza(CHEESE.toString());
        System.out.println("First pizza ordered is " + pizza);

        System.out.println("Stores available: ");
        ClassScanner.getAvailableStores().forEach(object -> System.out.println(object));
    }
}
