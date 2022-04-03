package com.prateek.javaMarchB2.patterns;

public class FirstLastDigit {
    public static void main(String[] args) {
        int n = 2356;

        System.out.println("last digit " + n%10);

        int sum = 0;
        int digit = 0;
        while(n>0){
            digit = n%10;
            sum = sum + digit;
            // update n
            n = n/10;
        }
        System.out.println("sum "+sum);
        System.out.println("first digit " + digit);

        // sum of digits of n using a for loop
         n = 2357;
         sum = 0;
         for(  ;n>0;n=n/10){
             sum = sum + n%10;
         }
        System.out.println("Final sum using for " + sum);



    }
}
