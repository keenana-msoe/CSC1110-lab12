/*
 * Course: CSC1110 - 131
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Andrew keenan
 * Created: 11-13-23
 */
package keenana;

import java.util.Scanner;

/**
 * class that defines a human player from an Ai player
 */
public class HumanPlayer extends Player {
    private final Scanner in;

    /**
     * constructor for the human player
     * @param name name of the player
     * @param in scanner used for input
     */
    public HumanPlayer(String name, Scanner in){
        super(name);
        this.in = in;
    }

    /**
     * method which asks the user if they want to hold
     * @param turnScore the score that has been rolled this turn
     * @return ture of false whether it is held
     */
    public boolean chooseToHold(int turnScore) {
        System.out.println("Hold? (y/n)");
        System.out.println("Turn score: " + turnScore);
        String choice = in.next();
        return choice.equals("y");
    }
}
