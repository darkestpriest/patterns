package factory.ch;

import factory.Pizza;

import static com.cardinal.factory.enums.PizzaType.VEGGIE;

/**
 * Created by maperez on 20/7/2017.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        super(VEGGIE.toString());
    }
}
