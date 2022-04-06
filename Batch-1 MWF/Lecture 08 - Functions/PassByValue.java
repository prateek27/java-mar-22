package com.prateek.javaMarchB2.functions1;

public class PassByValue {
    // Pass By Value -> data gets copied in new memory when a fn call is made
    public static void PesaDouble(int money){
        money = 2*money; //money is copy of M
        System.out.println("Scheme Money " + money);
    }
    // Pass By Value -> data gets copied in new memory when a fn call is made
    public static int joinScaler(int money){
        money = 2*money; // money is copy of M
        return money;
    }
    public static void main(String[] args) {
        int M = 100;
        PesaDouble(M);
        int returns = joinScaler(M);
        System.out.println("Actual " + returns);
    }

}
