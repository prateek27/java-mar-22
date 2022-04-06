package com.prateek.javaMarchB2.functions1;

public class AddFunDemo {

    public static int add(int a,int b){
        return a + b;
    }
    public static void addNum(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int res = add(10,20);
        System.out.println(res%2==0?"Even" : "odd");
        // add(10,20);
        // add(30,50);

        System.out.println(res);
    }
}
