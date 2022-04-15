package com.prateek.javaMarchB2.patterns;

public class CharPattern {
    public static void main(String[] args) {
        int N=5;
        char letter = 'A';
        for(int i=1; i<=N; i++){

            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(letter + " ");
            }
            //after every row the value of letter should get increment
            letter = (char)(letter + 1);
            System.out.println();
        }
    }
}
