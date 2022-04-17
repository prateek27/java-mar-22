package com.prateek.javaMarchB2.GameOOPS;

public class Game {
    private int expectedGuess;
    Player p1,p2,p3;

    // Constructor
    Game(String name1, String name2, String name3){
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    // Helper
    private boolean checkWinner(){
        // sorting
        if(p1.guess == expectedGuess){
            System.out.println(p1.name + " wins!");
            return true;
        }
        else if(p2.guess == expectedGuess){
            System.out.println(p2.name + " wins!");
            return true;
        }
        else if(p3.guess == expectedGuess){
            System.out.println(p3.name + " wins!");
            return true;
        }
        return false;
    }

    void start(){
        //launch the game
        System.out.println("Welcome to Game " + p1.name + p2.name + p3.name);
        expectedGuess = (int)(Math.random()*10);

        while(true){
            System.out.println("Number to guess is " + expectedGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            boolean someOneWins = checkWinner();
            if(someOneWins){
                System.out.println("Game over!");
                break;
            }
            else{
                //update the guess
                expectedGuess = (int)(Math.random()*10);
            }
        }
    }
}
