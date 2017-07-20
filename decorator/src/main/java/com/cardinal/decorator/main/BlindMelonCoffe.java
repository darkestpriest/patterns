package com.cardinal.decorator.main;

import com.cardinal.decorator.beverage.DarkRoast;
import com.cardinal.decorator.beverage.Espresso;
import com.cardinal.decorator.beverage.HouseBlend;
import com.cardinal.decorator.condiment.Mocha;
import com.cardinal.decorator.condiment.Soy;
import com.cardinal.decorator.condiment.Whip;
import com.cardinal.decorator.interfaces.Beverage;

/**
 * Created by maperez on 20/7/2017.
 */
public class BlindMelonCoffe {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        printBeverage(beverage);

        Beverage beverage0 = new DarkRoast();
        beverage0 = new Mocha(beverage0);
        beverage0 = new Mocha(beverage0);
        beverage0 = new Whip(beverage0);
        printBeverage(beverage0);

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        printBeverage(beverage1);
    }

    private static void printBeverage(Beverage beverage) {
        System.out.println(
                beverage.getDescription() + ": $" + beverage.cost());
    }
}
