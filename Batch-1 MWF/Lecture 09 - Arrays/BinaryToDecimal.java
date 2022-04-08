package com.prateek.javaMarchB2.arrays;

public class BinaryToDecimal {

    public static int binaryToDecimal(int N){
        int ans = 0;
        int p = 1;
        while(N!=0){
            int lastBit = N%10;
            ans = ans + lastBit*p;
            p = p*2;
            N = N/10;
        }
        return ans;
    }
    public static void decimalToBinary(int N){
        int p = 1;
        int ans = 0;
        while(N!=0){
            ans = ans + (N%2)*p;
            p = p*10;
            N = N/2;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        //System.out.println(binaryToDecimal(1101));
        decimalToBinary(57);
    }
}
