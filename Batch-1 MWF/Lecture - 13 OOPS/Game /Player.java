package com.prateek.javaMarchB2.GameOOPS;

import java.util.Scanner;

public class Player {
    String name;
    int guess; // object variable -> different for all objects
    static Scanner sc = new Scanner(System.in); //class variable -> shared across all objects of the class

    Player(String playerName){
        name = playerName;
    }

    void makeGuess(){
        long startTime = System.currentTimeMillis();
        guess = sc.nextInt();//(int)(Math.random()*10);
        long endTime = System.currentTimeMillis();
        System.out.println(name + "is guessing " + guess + " in time" + (endTime - startTime));
    }
}
