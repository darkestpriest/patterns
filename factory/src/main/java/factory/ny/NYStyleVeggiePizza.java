package factory.ny;

import factory.Pizza;

import static com.cardinal.factory.enums.PizzaType.VEGGIE;

/**
 * Created by maperez on 20/7/2017.
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        super(VEGGIE.toString());
    }
}
