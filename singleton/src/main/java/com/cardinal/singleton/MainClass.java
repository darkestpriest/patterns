package com.cardinal.singleton;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MainClass {

    public static void main(String[] args) {
        MainClass m = new MainClass();
        int max = (int)(Math.random() * 100.0);
        System.out.println("Creating " + max);
        m.generateThreads(max);
    }

    private List<Thread> generateThreads(int max) {
        List<Thread> threads = new ArrayList<>();
        IntStream.range(0, max).forEach(i -> threads.add(createThread()));
        return threads;
    }

    private Thread createThread() {
        String threadName = generateRandomString();
        Thread tx = new Thread(() -> boilTheBoiler(threadName));
        tx.setName(threadName);
        tx.start();
        return tx;
    }

    private void boilTheBoiler(String threadName) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        System.out.println(threadName + " - " + chocolateBoiler);
    }

    private String generateRandomString() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }
}
