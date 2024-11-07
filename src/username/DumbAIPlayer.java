/*
 * Course: CSC1110 - 131
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Andrew keenan
 * Created: 11-13-23
 */
package keenana;

/**
 * class that describes the dumb AI player
 */
public class DumbAIPlayer extends AIPlayer {
    private final Die coin;

    /**
     * constructor for the dumbAI which sets the coin value to
     * a die with 2 sides
     */
    public DumbAIPlayer(){
        super();
        coin = new Die(2);
    }

    /**
     * a method which descirbes the process of the dumb AI
     * choosing to hold or continue
     * @param turnScore int of the current score the AI is at
     * @return true or false whether it holds
     */
    public boolean chooseToHold(int turnScore){
        coin.roll();
        int decide = coin.getSideUp();
        return decide == 1;
    }
}
