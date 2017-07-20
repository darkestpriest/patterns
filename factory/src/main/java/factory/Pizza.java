package factory;

/**
 * Created by maperez on 20/7/2017.
 */
public class Pizza {

    private final String type;

    public Pizza(String type) {
        this.type = type;
    }

    public void prepare() {
        System.out.println(type + "prepare()");
    }

    public void bake() {
        System.out.println(type + "bake()");
    }

    public void cut() {
        System.out.println(type + "cut()");
    }

    public void box() {
        System.out.println(type + "box()");
    }
}
