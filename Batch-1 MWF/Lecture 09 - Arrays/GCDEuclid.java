package com.prateek.javaMarchB2.arrays;

import java.util.Scanner;

public class GCDEuclid {

    public static int gcd(int A,int B){
        while(A!=0){
            int A_ = B%A;
            int B_ = A;
            A = A_;
            B = B_;
        }
        return B;
    }

    public static void gcdOfN(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = sc.nextInt(); // 10

        for(int i=1; i<=N-1; i++){
            int no = sc.nextInt();
            ans = gcd(ans, no);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        gcdOfN();
        /*
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(gcd(a,b));
        }

         */

    }
}
