/*
 * Course: CSC1110 - 131
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Andrew keenan
 * Created: 11-13-23
 */
package keenana;

/**
 * class that builds the threshold AI player which determines the
 * action based off of a set threshold
 */
public class ThresholdAIPlayer extends AIPlayer {
    private final int threshold;

    /**
     * constructor for the threshold AI player
     * @param threshold the threshold we want to set the AI player too
     */
    public ThresholdAIPlayer(int threshold){
        super();
        this.threshold = threshold;
    }

    /**
     * describes the logic for the threshold AI to hold
     * @param turnScore the score the AI has
     * @return true or false whether it holds or not
     */
    public boolean chooseToHold(int turnScore){
        return threshold > turnScore;
    }
}
