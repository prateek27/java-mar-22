package com.prateek.javapractice;

import java.util.HashMap;

public class HashMapDemo {

    //psvm
    public static void main(String[] args) {

        //Restaurent Menu
        // Wrapper Classes for all primitives
        HashMap<String,Integer> menu = new HashMap<>();

        menu.put("burger",80);
        menu.put("pizza",120);
        menu.put("drink",70);
        menu.put("noodles",90); // insert

        // noodles have become costlier
        menu.put("noodles",menu.get("noodles") + 10);

        
        menu.put("noodles", menu.getOrDefault("noodles",0) + 1);


        // menu.remove("pizza");

        if(menu.containsKey("pizza")){ //search
            System.out.println("yes it is present" + menu.get("pizza") );
        }
        else{
            System.out.println("stock finished");
        }

        //iterate over all key values pairs
        for(String key : menu.keySet()){
            if(menu.get(key) <=100) {
                System.out.println(key + "- " + menu.get(key));
            }
        }
    }

}
