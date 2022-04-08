package com.prateek.javaMarchB2.loopsM;

public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        int gcd = 1;
        int smallest;
        /*
        if(a<b){
            smallest = a;
        }
        else{
            smallest = b;
        }
         */

        for(int i=1; i<=a && i<=b; i=i+1){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
