package com.prateek.javaMarchB2.patterns;

public class PatternZeroOne {
    public static void main(String[] args) {
        int n =5 ;

        for(int i=1; i<=n; i++){
            // start val 0 for even row or 1 for odd row
            int val = i%2;
            //print i no in each row
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val);
                val = 1 - val;
            }
            // newline
            System.out.println();
        }
    }
}
