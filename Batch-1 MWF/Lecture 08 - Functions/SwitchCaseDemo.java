package com.prateek.javaMarchB2.functions1;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 :
                System.out.println("Monday");
                break; //after every case
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");

            case 6:
            case 7:
                System.out.println("Weekend!");
                break;

            default:
                System.out.println("Enter a valid input");
        }

    }
}
