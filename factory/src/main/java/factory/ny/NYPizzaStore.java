package factory.ny;

import com.cardinal.factory.interfaces.PizzaStore;
import factory.Pizza;

import static com.cardinal.factory.enums.PizzaType.CHEESE;
import static com.cardinal.factory.enums.PizzaType.PEPPERONI;
import static com.cardinal.factory.enums.PizzaType.VEGGIE;

/**
 * Created by maperez on 20/7/2017.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals(CHEESE.toString())) {
            return new NYStyleCheesePizza();
        }
        if(type.equals(VEGGIE.toString())) {
            return new NYStyleVeggiePizza();
        }
        if(type.equals(PEPPERONI.toString())) {
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
