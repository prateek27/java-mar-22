package com.prateek.javaMarchB2.functions1;

public class Operators {
    public static void main(String[] args) {
        int x = 10;
        x++;
        int y = x++;
        System.out.println(x + " " + y);

        x = 10;
        y = ++x;
        System.out.println(x + " " + y);


        x = 10;
        y = x = 20;
        System.out.println(x + " " + y);

        //compound divison
        int a = 45;
        a /= 9;
        System.out.println(a);

        //ternary op
        a = 180;
        int b = 20;

        // Ternary Op
        int large = a > b ? a : b;
        System.out.println(large);

        // Print even or odd
        int num = 12;
        System.out.println(num%2==0?"Even" : "Odd");

        for(int i=1; i <= (a>b ? b : a); i++){
            System.out.println(i%2==0?"Even" +i : "Odd"+i);
        }

    }
}
