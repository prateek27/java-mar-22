package com.prateek.javapractice.bitmasking;

import java.util.Arrays;

public class Bitmasking {

    static void uniqueNumber3(){
        int[] arr = {2,2,4,3,4,4,7,7,7,6,6,6,2};
        int freq[] = new int[32]; //default value is 0

        for(int x : arr){
            // Remove the bits of x and update the freq array
            int j = 0;
            while(x>0){
                int last_bit = (x&1);
                freq[j] += last_bit;
                j = j + 1;
                x = x >> 1;
            }
        }
        // next step
        int ans = 0;
        int p = 1;

        for(int i=0; i<=31; i++){
            freq[i] = freq[i]%3; //removes contribution of numbers repeating thrice
            // binary to decimal
            ans = ans + freq[i]*p;
            p = p<<1; // p = p*2
        }
        // generate a number
        System.out.println(ans);
        System.out.println(Arrays.toString(freq));
    }

    static int power(int a,int n){
        int ans = 1;

        while(n>0){
            int last_bit = n&1;
            if(last_bit==1){
                ans = ans*a;
            }
            //square a
            a = a*a;
            // remove last bit
            n = n>>1;
        }
        return ans;
    }

    static int CntBits1(int n){
        int cnt=0;
        while(n>0){
            int rem = n%2;
            cnt = cnt + rem;
            n = n/2;
        }
        return cnt;
    }

    static int CntBits2(int n){
        int cnt = 0;
        while(n>0){
            int lastBit = n&1;
            cnt = cnt + lastBit;
            n = n>>1;
        }
        return cnt;
    }

    static int getNo(int x,int y){
        // int firstNo = 1 << x; //2^x
        // int secondNo = 1 << y; //2^y;
        // System.out.println(firstNo +"," + secondNo);
        return (1<<x)|(1<<y);
    }

    static int getIthBit(int no,int i){
        return (no >> i) & 1;
    }
    static int getIthBit2(int no,int i){
        int result = no & (1<<i);
        if(result>0){
            return 1;
        }
        return 0;
    }

    static int setIthBit(int no,int i){
        return no | (1<<i);
    }


    public static void main(String[] args) {
        uniqueNumber3();
        System.out.println(power(2,10));
        System.out.println(power(5,5));
        /*
        int x = -7;
        System.out.println(x >> 1);

        x = 7;
        System.out.println(x >> 2);

        System.out.println(-1 >> 4); //it would still  all 1s after shifting
        System.out.println(1 >> 4);

        System.out.println(-1 >>> 29); //unsigned right shift
        System.out.println(-1 >>> 31); // unsigned right shift
        System.out.println(-5 >>> 2); // 2 fillers here

        System.out.println(CntBits1(1004567));
        System.out.println(CntBits2(1004567));

        System.out.println(getNo(1,3));
        System.out.println(setIthBit(13,1)); */
        System.out.println(-10 % 7);
    }
}
