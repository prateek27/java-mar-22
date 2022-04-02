package com.prateek.javaMarchB2.loops;

public class GCDBasic {
    public static void main(String[] args) {

        int A = 12;
        int B = 20;

        int gcd = 1;
        int smaller;

        if(A<B){
            smaller = A;
        }
        else{
            smaller = B;
        }

        for(int i=1; i<=smaller; i=i+1){
            if(A%i==0 && B%i==0){
                gcd = i;
            }
        }

        //print gcd
        System.out.println(gcd);

    }
}
