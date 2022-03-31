package com.prateek.javaMarchB2;

import java.util.Scanner;

public class SeriesPrintNTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Print N terms of the series 3i + 2 which are not multiples of 5
        int n = sc.nextInt();
        int i = 1;
        int cnt = 0;
        while(cnt<n){
            int term  = 3*i + 2;
            if(term%5 != 0) {
                System.out.println(term);
                cnt++;
            }
            i = i + 1;
        }
    }
}
