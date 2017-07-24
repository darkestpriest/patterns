package com.cardinal.template.comparables;

public class Duck implements Comparable {

    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;

        if(this.weight < otherDuck.weight) {
            return -1;
        }
        if(this.weight == otherDuck.weight) {
            return 0;
        }
        if(this.weight > otherDuck.weight) {
            return 1;
        }
        return 0;
    }
}
