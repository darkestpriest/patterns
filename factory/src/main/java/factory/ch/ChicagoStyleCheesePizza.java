package factory.ch;


import factory.Pizza;

import static com.cardinal.factory.enums.PizzaType.CHEESE;

/**
 * Created by maperez on 20/7/2017.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        super(CHEESE.toString());
    }
}
