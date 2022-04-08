package com.prateek.javaMarchB2.functions2;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int day = 7;

        switch(day){
            case 1 :
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3 :
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5 :
                System.out.println("fri");
                break;
            case 6,7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("enter a valid day");
        }
    }
}
