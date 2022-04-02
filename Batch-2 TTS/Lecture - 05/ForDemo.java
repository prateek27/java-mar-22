package com.prateek.javaMarchB2.loops;

public class ForDemo {
    public static void main(String[] args) {

        // Print 1 to 5
        int i=1;
        while(i<=5){
            System.out.println(i);
            i = i + 1;
        }

        System.out.println("For Loop");

        // Print 1 to 5

        for(int j=1;j<=5;j=j+1){
            System.out.println(j);
        }

        int j=1;
        for(;j<=5;){
            System.out.println(j);
            j=j+1;
        }


    }
}
