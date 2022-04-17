package com.prateek.javaMarchB2.OOPS2;

import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) {
        Player players[] = new Player[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            // allocates the memory for ith player
            players[i] = new Player(name);
            players[i].makeGuess();
        }
    }
}
