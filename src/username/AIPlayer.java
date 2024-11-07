/*
 * Course: CSC1110 - 131
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Andrew keenan
 * Created: 11-13-23
 */
package keenana;

/**
 * class which describes the AI player which implements the
 * player class
 */
public abstract class AIPlayer extends Player {
    private static int numberOfAIPlayers = 0;

    /**
     * constructor for the AI player which tracks the amonunt of AI
     * players in the game
     */
    public AIPlayer(){
        super("Bot #"+numberOfAIPlayers);
        numberOfAIPlayers++;
    }
}
