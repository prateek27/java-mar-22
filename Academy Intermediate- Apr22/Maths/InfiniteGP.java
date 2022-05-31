package com.prateek.javapractice.Maths;

public class InfiniteGP {
    public static void main(String[] args) {
        float a = 2f;
        float sum = 0f;
        float r = 0.5f;
        // sum of gP
        while(a!=0){
            sum = sum + a;
            a = a*r;
        }
        System.out.println(sum);
    }
}
