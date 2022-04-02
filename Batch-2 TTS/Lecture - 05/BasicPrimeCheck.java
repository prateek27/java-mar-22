package com.prateek.javaMarchB2.loops;

public class BasicPrimeCheck {

    public static void main(String[] args) {

        int n = 11;
        int cnt = 0;

        for(int i=1; i<=n; i++){
            //check if n is div by i
            if(n%i==0){
                cnt = cnt + 1;
            }
        }
        // after loop is over
        if(cnt==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }

}
