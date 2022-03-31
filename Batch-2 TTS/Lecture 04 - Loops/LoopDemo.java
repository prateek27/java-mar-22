package com.prateek.javaMarchB2;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        // Read a number
        int n = sc.nextInt();
        System.out.println("You entered " + n);

        int cal = 0;
        while(cal<n){
            System.out.println("Run 1 step " +(cal+1));
            cal = cal + 1;
        }

        System.out.println("Stop , Cal Burned " + cal);
    }
}
