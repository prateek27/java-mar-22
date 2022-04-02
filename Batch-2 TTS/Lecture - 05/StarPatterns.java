package com.prateek.javaMarchB2.loops;

public class StarPatterns {
    public static void main(String[] args) {
        int n  = 4;
        for(int row=1; row<=n; row=row+1){
            // print N stars for each row
            for(int cnt=1; cnt<=row; cnt=cnt+1){
                System.out.print("* ");
            }
            //new line
            System.out.println();
        }

        // Number Staricase print
        for(int row=1; row<=n; row=row+1){
            // print N stars for each row
            for(int cnt=1; cnt<=row; cnt=cnt+1){
                System.out.print(cnt);
            }
            //new line
            System.out.println();
        }
        // Number Staircase print with val

        int val = 1;
        for(int row=1; row<=n; row=row+1){
            // print N stars for each row
            for(int cnt=1; cnt<=row; cnt=cnt+1){
                System.out.print(val + " ");
                val = val + 1;
            }
            //new line
            System.out.println();
        }
    }


}
