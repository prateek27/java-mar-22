package com.prateek.javaMarchB2.functions1;

import java.util.Scanner;

public class SwitchCaseCalc {
    public static void main(String[] args) {

        // a operator b
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        switch(op){
            case "+" :
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            default:
                System.out.println("Enter a valid op");
                break;//optional
        }

    }
}
