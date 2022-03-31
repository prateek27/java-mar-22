package com.prateek.javaM1;

public class LoopProblems {
    // You need to write a loop to print
    // all numbers from 1 to N
    // all numbers from N to 1
    // all even numbers from 1 to N
    // sum of all numbers from 1 to N
    // sum of all odd numbers from 1 to N
    // print all multiples of 4 from 1 to N
    public static void main(String[] args) {

        int n = 10;

        int i=1; //start
        while(i<=n){
            System.out.println(i);
            i = i + 1;
        }

        System.out.println("N to 1");

        i = n;
        while(i>=1){
            System.out.println(i);
            i = i - 1;
        }

        System.out.println("Even Numbers from 1 to N");
        i = 2;
        while(i<=n){
            System.out.println(i);
            i = i + 2;
        }

        // Powers of 2
        System.out.println("Powers from 1 to 100");
        i = 1;
        while(i<=100){
            System.out.println(i);
            i = i*2;
        }

        // Factorial
        int num = 5;
        i = 1;
        int ans = 1;
        while(i<=num){
            ans = ans * i;
            i = i + 1;
        }
        System.out.println("Factorial " + ans);

        // Sum of Even Numbers from 1 to N
        i = 2;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("Sum is " + sum);

        // first N terms of series 3i  + 2
        i = 1;
        n = 5;
        while(i<=n){
            System.out.println(3*i + 2);
            i = i + 1;
        }

        // first N terms of series 3i  + 2 but which are not multiple of 5
        int valid_terms = 0;
        i = 1;
        while(valid_terms<6){
            int val = 3*i + 2;
            if(val%5 != 0){
                System.out.println(val);
                valid_terms = valid_terms + 1;
            }
            i = i + 1;
        }







    }
}
