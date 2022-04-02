package com.prateek.javaMarchB2.loops;

public class ScopeDemo {
    public static void main(String[] args) {
        int i;

        for(i=1; i<=5; i++){
            int money = 100;
            System.out.println(i);
        }

        System.out.println("Loop over " +i);
    }
}
