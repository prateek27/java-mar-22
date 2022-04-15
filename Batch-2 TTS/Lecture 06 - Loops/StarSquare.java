package com.prateek.javaMarchB2.loopsM;

public class StarSquare {
    public static void main(String[] args) {
        int N = 5;

        // N Rows
        for(int i=1; i<=N; i++){

            for(int cnt=1; cnt<=N; cnt++){
                System.out.print("* ");
            }
            //new line
            System.out.println();
        }
        System.out.println("Star triangle");

        for(int i=1; i<=N; i++){

            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(cnt);
            }
            //new line
            System.out.println();
        }

        //print row no
        for(int i=1; i<=N; i++){

            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(i);
            }
            //new line
            System.out.println();
        }

        //
        int n = 4;
        int val = 1;
        for(int i=1; i<=n; i++){
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val + " ");
                val = val + 1;
            }
            System.out.println();
        }

    }
}
