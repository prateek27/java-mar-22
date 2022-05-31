package com.prateek.javapractice.Maths;

public class SumBreak {
    public static void main(String[] args) {
        int S = 15;
        int sum = 0;
        for(int i=1; sum<S ; i++){
            System.out.println(i);
            sum = sum + i;
        }

        // while(sum<S){...}
        // while(true){...if(sum>S) break; ....}
    }
}
