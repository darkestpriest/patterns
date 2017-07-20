package factory.ny;

import factory.Pizza;

import static com.cardinal.factory.enums.PizzaType.PEPPERONI;

/**
 * Created by maperez on 20/7/2017.
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        super(PEPPERONI.toString());
    }
}
