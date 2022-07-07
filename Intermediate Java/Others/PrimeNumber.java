package com.prateek.javapractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Check if a Number is Prime
        // As soon as you get a divisor, you know it is not prime
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int div;
        for(div=2; div<=N-1; div++){
            if(N%div==0){
                break;
            }
        }
        // Identify
        // div will reach value N only when loop completes by itself that means there is no divisor less than N which was found
        if(div==N){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not-Prime");
        }
    }
}
