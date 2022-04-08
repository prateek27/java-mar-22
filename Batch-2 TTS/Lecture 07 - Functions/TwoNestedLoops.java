package com.prateek.javaMarchB2.functions2;

public class TwoNestedLoops {
    public static void sum(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.println(i+j);
                if(i+j==4){
                    System.out.println("Breaking");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        sum();
    }
}
