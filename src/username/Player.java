/*
 * Course: CSC1110 - 131
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Andrew keenan
 * Created: 11-13-23
 */
package keenana;

/**
 * class for the player that determines the basic actions of
 * a player in the game
 */
public abstract class Player {
    private final String name;
    private int score;

    /**
     * public constructor for the player which initializes
     * its score and also sets the name
     * @param name the name of the player that wll be playing
     */
    public Player(String name){
        this.name = name;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    /**
     * adds to their score based off of the score they rolled that
     * turn
     * @param turnScore the score they rolled that turn
     */
    public void addToScore(int turnScore){
        score += turnScore;
    }

    /**
     * abstract method used by the child classes to determine
     * if they want to hold
     * @param turnScore the score that has been rolled this turn
     * @return boolean if they are holding
     */
    public abstract boolean chooseToHold(int turnScore);

    /**
     * basic toString that is called for the whole game
     * @return the string that is used ot display scores
     */
    public String toString(){
        return getName()+": "+getScore();
    }
}
