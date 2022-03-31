package com.prateek.javaMarchB2;

public class LoopPrint {
    public static void main(String[] args) {
        int n = 20;

        // Write a Loop that prints 1 to N
        /*
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i = i + 1;
        }*/
        // Write a Loop that prints even nos in the range 1 to N
        /* int i = 2;
        while(i<=n){
            System.out.println(i);
            i = i + 2;
        } */
        // Write a Loop that prints N to 1
        /*
        int i = n;
        while(i>=1){
            System.out.println(i);
            i = i - 1;
        } */

        // 1 to N that prints all the mutiple of 4
        int i = 1;
        while(i<=n){
            if(i%4==0){
                System.out.println(i);
            }
            i = i + 1;
        }

        i = 4;
        while(i<=n){
            System.out.println(i);
            i = i + 4;
        }


    }
}
