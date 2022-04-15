package com.prateek.javaMarchB2.arraysb2;

public class ArrayReturnDemo {

    public static int[] getShoppingList(){

        int[] shop_items_cost = {10,20,30};
        // int shop_items_price[] = {10,20,30}; //also a valid syntax
        return shop_items_cost;
    }

    public static void main(String[] args) {
        int[] shoppingList = getShoppingList();
        System.out.println(shoppingList);
    }
}
