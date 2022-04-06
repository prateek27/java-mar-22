package com.prateek.javaMarchB2.loopsM;

public class ScopeDemo {
    public static void main(String[] args) {


        if(true){
            int money = 20;
        }
        int i; //declaring
        for(i=1; i<=5; i++){
            //work
            System.out.println(i);
        }
       System.out.println("Final value of " + i);

    }
}
