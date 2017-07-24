package com.cardinal.proxy.main;

import com.cardinal.proxy.machine.GumballMachine;
import com.cardinal.proxy.machine.GumballMonitor;

import java.rmi.Naming;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        GumballMachine gumballMachine;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("localhost", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
