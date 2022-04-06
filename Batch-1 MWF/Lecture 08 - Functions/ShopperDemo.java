package com.prateek.javaMarchB2.functions1;

public class ShopperDemo {

    public static int shopping(String item1, String item2,int money){
        int cost1 = 25;
        int cost2 = 60;
        System.out.println("Bringing "+item1 + " and " + item2);

        return money - cost1 - cost2;
    }

    public static void main(String[] args) {
        int money = 100;
        int remMoney = shopping("Apples","Oranges",money);
        System.out.println(money);
        System.out.println(remMoney);
    }
}
