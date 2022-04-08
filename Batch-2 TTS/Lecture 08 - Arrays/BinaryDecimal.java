package com.prateek.javaMarchB2.arrays2;

public class BinaryDecimal {

    public static int binaryToDecimal(int n){
        int ans = 0;
        int p = 1;
        while(n!=0){
            int last_bit = n%10;
            ans = ans + last_bit*p;
            p = 2*p;
            n = n/10;
        }
        return ans;
    }

    public static int decimalToBinary(int n){
        int p = 1;
        int ans = 0;
        while(n!=0){

            int digit = n%2;
            ans = ans + p*digit;
            p = 10*p;
            n = n/2;
        }
        return ans;
    }

    public static void main(String[] args) {
       // System.out.println(binaryToDecimal(10101));
        System.out.println(decimalToBinary(13));

    }
}
