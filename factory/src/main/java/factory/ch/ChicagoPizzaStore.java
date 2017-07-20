package factory.ch;

import com.cardinal.factory.interfaces.PizzaStore;
import factory.Pizza;

import static com.cardinal.factory.enums.PizzaType.*;

/**
 * Created by maperez on 20/7/2017.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals(CHEESE.toString())) {
            return new ChicagoStyleCheesePizza();
        }
        if(type.equals(VEGGIE.toString())) {
            return new ChicagoStyleVeggiePizza();
        }
        if(type.equals(PEPPERONI.toString())) {
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
