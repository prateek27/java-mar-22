package com.prateek.javaMarchB2.patterns;

import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int n=A; n<=B; n=n+1){
            // print n if n is a prime no
            int i;
            for(i=2;i<n;i=i+1){
                if(n%i==0){
                    break;
                }
            }
            if(i==n) {
                System.out.println(n);
            }
        }

    }
}
