package com.prateek.javaMarchB2.OOPS2;

public class Player {
    String name;
    int number;

    Player(String playerName){
        name = playerName;
    }

    void makeGuess(){
        number = (int)(Math.random()*10);
        System.out.println(name + " guessed " + number);
    }
}
