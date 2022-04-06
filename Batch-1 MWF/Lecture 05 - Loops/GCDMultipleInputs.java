package com.prateek.javaMarchB2.loopsM;

import java.util.Scanner;

public class GCDMultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //use it
        int T = sc.nextInt();
        // loop T times
        for(int t=1; t<=T; t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = 1;

            for(int i=1; i<=Math.min(a,b); i=i+1){
                if(a%i==0 && b%i==0){
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
        // Highest Common Factor / Greatest Common Div

    }
}
