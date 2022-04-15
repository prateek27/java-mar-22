package com.prateek.javaMarchB2.Strings;

import java.util.Scanner;

// Interesting Experiement for Speed Comparison
public class StringPerformanceComparison {

    static void addToStringUsingSB(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            //string are immutable
            sb.append((char)('A' + i));
            // System.out.println(s);
        }
    }

    static void addToString(int n){
        String s = "";
        for(int i=0; i<n; i++){
            //string are immutable
            s = s + (char)('A' + i);
            // System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int n = sc.nextInt();

            long start = System.currentTimeMillis();
            addToStringUsingSB(n);
            long end = System.currentTimeMillis();
            System.out.println("String Builder  " + (end - start));

            start = System.currentTimeMillis();
            addToString(n);
            end = System.currentTimeMillis();
            System.out.println("String " + (end - start));
        }
    }
}
