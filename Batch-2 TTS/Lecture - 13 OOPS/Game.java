package com.prateek.javaMarchB2.OOPS2;

public class Game {
    int expectedGuess;
    Player p1, p2, p3; // Player player[] = new Player[3];

    // Game constructor
    Game(String name1, String name2, String name3){
        // p[i] = new Player(...)
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }
    boolean checkWinner(){
        if(p1.number == expectedGuess){
            System.out.println(p1.name + " wins");
            return true;
        }
        else if(p2.number == expectedGuess){
            System.out.println(p2.name + " wins");
            return true;
        }
        else if(p3.number == expectedGuess){
            System.out.println(p3.name + " wins");
            return true;
        }
        return false;
    }

    void launch(){
        expectedGuess = (int)(10*Math.random());

        while(true){
            System.out.println("Number to guess is " + expectedGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            boolean gameOver = checkWinner();
            if(gameOver){
                break;
            }
            //update the guess & play again
            expectedGuess = (int)(10*Math.random());
        }
    }
}
