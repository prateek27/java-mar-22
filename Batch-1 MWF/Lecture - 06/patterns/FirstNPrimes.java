package com.prateek.javaMarchB2.patterns;

public class FirstNPrimes {
    public static void main(String[] args) {
        int limit = 7;

        int n =2;
        for(int cnt=0; cnt<limit; ){
            //increment the count when you find i to be a prime no
            int i;
            for(i=2;i<n;i=i+1){
                if(n%i==0){
                    break;
                }
            }
            if(i==n) {
                System.out.println(n);
                cnt = cnt + 1;
            }
            n = n+1;
        }

    }
}
