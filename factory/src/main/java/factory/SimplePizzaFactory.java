package factory;

/**
 * Created by maperez on 20/7/2017.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return new Pizza(type);
    }
}
