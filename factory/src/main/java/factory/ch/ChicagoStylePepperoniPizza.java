package factory.ch;

import factory.Pizza;

import static com.cardinal.factory.enums.PizzaType.PEPPERONI;

/**
 * Created by maperez on 20/7/2017.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        super(PEPPERONI.toString());
    }
}
