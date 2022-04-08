package com.prateek.javaMarchB2.functions2;

public class OperatorsDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        System.out.println(x + " " + y);

        x = 10;
        y = ++x;
        System.out.println(x+ " " + y);

        // guess the output
        x = 5;
        y = x = 20;
        System.out.println(x + " " + y);

        // ravi's doubt
        x = 10;
        y = x + 1; //not same as y = x++
        System.out.println(x + " " + y);

        // compound assignment operators
        int a = 25;
        a %= 7;
        System.out.println(a);
        a /= 4;
        System.out.println(a);

        // ternary opa
        a = 20;
        int b = 150;

        System.out.println(a>b ? a : b);

        int largest = a>b ? a : b;
        System.out.println("largest " + largest);
        System.out.println( a%2==0 ? "even" : "odd");

    }
}
