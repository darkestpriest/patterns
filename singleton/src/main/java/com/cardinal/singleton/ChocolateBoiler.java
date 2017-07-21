package com.cardinal.singleton;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler instance;

    private ChocolateBoiler(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if(instance == null) {
            synchronized (ChocolateBoiler.class) {
                if(instance == null) {
                    instance = new ChocolateBoiler(true, false);
                }
            }
        }
        return instance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling boiler");
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiling the boiler");
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
