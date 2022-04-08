package com.prateek.javaMarchB2.functions2;

public class FunctionDemo {

    public static void sayHi(){
        System.out.println("Hello");
    }
    public static void sayHi(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        sayHi();
        sayHi();
        sayHi("Prateek");
        sayHi("Ankit");
        // sayHi("Prateek");
    }
}
