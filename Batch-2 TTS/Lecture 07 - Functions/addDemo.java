package com.prateek.javaMarchB2.functions2;

public class addDemo {

    /*
    public static void add(int a,int b){
        System.out.println(a+b);
    }
     */
    public static int add(int a,int b){
        return a + b;
    }

    public static void main(String[] args) {
        int res = add(5,4);
        System.out.println(res);
        System.out.println(add(10,12));
    }
}
