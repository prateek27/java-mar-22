package com.prateek.javapractice.Maths;

import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int n){

        for(int i=2; i*i <=n; i++){
            //stop the fun as you get the first divisor
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int A,int B){
        for(int i=A; i<=B; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    // Find the sum of divisors of a number
    public static int sumDivisors(int n){
        int sum = 0;
        for(int i=1; i*i <=n; i++){
            if(n%i==0){
                if(i*i==n){
                    // square root of N
                    sum = sum + i;
                }
                else{
                    sum = sum + i + n/i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDivisors(n));
        int A = sc.nextInt();
        int B = sc.nextInt();
        printPrimes(A,B);

    }
}
