package factory.ny;


import factory.Pizza;

import static com.cardinal.factory.enums.PizzaType.CHEESE;

/**
 * Created by maperez on 20/7/2017.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        super(CHEESE.toString());
    }
}
