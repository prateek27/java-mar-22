package com.prateek.javaMarchB2.arrays2;

import java.util.Scanner;

public class GCDEuclid {
    // GCD
    public static int gcd(int A,int B){
        while(A!=0){
            int A_ = B%A;
            int B_ = A;
            //update
            A = A_;
            B = B_;
        }
        return B;
    }
    public static void gcdOfN(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // logic ....
        // N = 5
        // 10,20,40, 5, 12
        int ans = sc.nextInt();
        for(int i=1; i<=N-1; i++){
            int next_no = sc.nextInt();
            if(next_no<0){
                next_no = next_no*-1;
            }
            ans = gcd(ans,next_no);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // T Lines of Code, and you have output GCD every such pair
        int T = sc.nextInt();

        for(int i=1; i<=T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int ans = gcd(A,B);
            System.out.println(ans);
            int lcm = A*B/ans;
        }
    }
}
