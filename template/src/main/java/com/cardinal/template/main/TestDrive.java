package com.cardinal.template.main;

import com.cardinal.template.caffeine.Coffee;
import com.cardinal.template.caffeine.Tea;

public class TestDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();

    }
}
