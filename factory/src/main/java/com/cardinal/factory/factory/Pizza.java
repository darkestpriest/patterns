package com.cardinal.factory.factory;

import com.cardinal.factory.interfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by maperez on 20/7/2017.
 */
public abstract class Pizza {

    private String type;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggie[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected List<String> toppings = new ArrayList<>();;

    public abstract void prepare() ;

    public void bake() {
        System.out.println(type + " bake()");
    }

    public void cut() {
        System.out.println(type + " cut()");
    }

    public void box() {
        System.out.println(type + " box()");
    }

    public void setName(String name) {
        this.type = name;
    }

    public String getName() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "type='" + type + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", toppings=" + toppings +
                '}';
    }
}
