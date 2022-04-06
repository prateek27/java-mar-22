package com.prateek.javaMarchB2.functions1;

public class FunctionsDemo {

    public static void sayHi(){
        System.out.println("Hello everyone!");
    }

    public static void sayHello(String name){
        System.out.println("Hello "+name);
    }

    public static void add(int a,int b){
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        sayHi();
        sayHello("prateek");
        sayHello("himanshu");
        add(5,6);
    }
}
