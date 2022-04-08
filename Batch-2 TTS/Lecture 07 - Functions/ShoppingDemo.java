package com.prateek.javaMarchB2.functions2;

public class ShoppingDemo {

    public static void roboGoShopping(String item1, String item2){
        System.out.println("Bringing "+item1 + " and "+item2);
    }

    public static int roboGoShoppingWithMoney(String item1, String item2,int money){
        int cost1 = 40;
        int cost2 = 25;
        System.out.println("Bringing "+item1 + " and "+item2);
        return money - cost1 - cost2;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("We are going shopping");
        roboGoShopping("Apples","Oranges");
        roboGoShopping("Tomatos","Milk");
        int money = 100;
        money = roboGoShoppingWithMoney("Apples","Mangoes",money);
        System.out.println("Money left" + money);
    }
}
