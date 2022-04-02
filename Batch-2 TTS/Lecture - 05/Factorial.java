package com.prateek.javaMarchB2.loops;

public class Factorial {
    public static void main(String[] args) {

        int ans = 1;
        int n =5;
        //prod of n terms
        for(int i=1; i<=n; i++){
            ans = ans * i;
        }
        System.out.println(ans);

        //sum of n terms
        ans = 0;
        for(int i=1; i<=n; i++){
            ans = ans + i;
        }
        System.out.println(ans);



    }
}
