package com.cardinal.template.main;

import com.cardinal.template.comparables.Duck;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };
        display(ducks);
        System.out.println("Ordering\n");
        Arrays.sort(ducks);

        display(ducks);
    }

    private static void display(Duck[] ducks) {
        IntStream.range(0, ducks.length)
                .forEach(i -> System.out.println(ducks[i]));
    }
}
