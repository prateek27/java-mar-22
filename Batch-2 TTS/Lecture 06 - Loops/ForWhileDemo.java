package com.prateek.javaMarchB2.loopsM;

public class ForWhileDemo {
    public static void main(String[] args) {

        // print all even numbers between 1 to N
        int i = 2;
        int N = 15;
        while(i<=N){
            System.out.println(i);
            i = i + 2;
        }

        // For Loop
        System.out.println("For Loop");
        i=2;
        for(  ;i<=N;i=i+2){
            System.out.print(i + " ");
        }

        // Print all odd numbers from N to 1
        i = N;
        for( ; i>=1; i=i-2){
            System.out.print(i + " ");
        }

    }
}
