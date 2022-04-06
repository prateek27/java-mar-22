package com.prateek.javaMarchB2.patterns;

public class NumberPyramid {
    public static void main(String[] args) {

        int n = 5;
        for(int i=1; i<=n; i++){
            // N - i spaces
            for(int spaces=1; spaces<=n-i; spaces++){
                System.out.print("0 ");
            }
            // print i no in inc order start from val = i
            int val = i;
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val + " ");
                val = val + 1;
            }
            // print i-1 no in dec order
            val = val - 2;
            for(int cnt=1; cnt<=i-1; cnt++){
                System.out.print(val + " ");
                val = val - 1;
            }
            // N - i spaces
            for(int spaces=1; spaces<=n-i; spaces++){
                // no space if it is is the last zeroes
                if(spaces==n-i){
                    System.out.print("0");
                }
                else {
                    System.out.print("0 ");
                }
            }
            // new line after every row
            System.out.println();
        }

    }
}
