package com.prateek.javaMarchB2.loops;

public class PowersOf2 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=100){
            System.out.println(i);
            i = i * 2;
        }

        // For Loop
        System.out.println("For Loop");
        for(i=1; i<=100; i=i*2){
            System.out.println(i);
        }
    }
}
