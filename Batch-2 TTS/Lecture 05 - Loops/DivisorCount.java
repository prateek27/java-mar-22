package com.prateek.javaMarchB2.loopsM;

public class DivisorCount {
    public static void main(String[] args) {

        int n = 29;
        // count how many divisors are there?
        int cnt = 0;

        for(int i=1; i<=n; i=i+1){
            if(n%i==0){
                cnt = cnt + 1;
            }
        }
        // print the updated cnt
        System.out.println(cnt + " Divisors");
        
        if(cnt==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }


    }
}
