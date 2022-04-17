package com.prateek.javaMarchB2.OOPS2;

import java.util.Scanner;

public class ReverseWords {

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // System.out.println(line);
        String words[] = line.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            System.out.println(s);
            sb.append(reverse(s));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
