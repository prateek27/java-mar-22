package com.prateek.javaM1;

import java.util.Scanner;

public class CalDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cal = 0;
        while(cal<n){
            System.out.println("Running 1 step " + (cal+1));
            cal = cal + 1;
        }
        System.out.println("Target Achieved, take rest");
    }
    // You need to write a loop to print
    // all numbers from N to 1
    // all even numbers from 1 to N
    // sum of all numbers from 1 to N
    // sum of all odd numbers from 1 to N
    // print all multiples of 4 from 1 to N
}
