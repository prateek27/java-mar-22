package com.prateek.javaMarchB2.GameOOPS;

public class TestGame {
    public static void main(String[] args) {

        Game g1 = new Game("Athresh","Pankaj","Kintan");
        g1.start();

        Game g2 = new Game("Athresh","Pankaj","Vinay");
        g2.start();
        /*
        Player p1 = new Player("Pankaj");
        p1.makeGuess();

        Player p2 = new Player("Priya");
        p2.makeGuess();
         */
    }
}
