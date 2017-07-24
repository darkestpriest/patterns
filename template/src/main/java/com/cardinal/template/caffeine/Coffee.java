package com.cardinal.template.caffeine;

import com.cardinal.template.interfaces.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

    public void brew() {
        System.out.println("Dripping Coffee through fi lter");
    }
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
