/*
 * Course: CSC1110 - 131
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Andrew keenan
 * Created: 11-13-23
 */
package keenana;

import java.util.ArrayList;
import java.util.Random;

/**
 * class with methods that helps with the running of the game
 * and smoothness of the main method
 */
public class PigGame {
    private final Die die;
    private final ArrayList<Player> players;

    /**
     * constructor for the Pig Game setting up the die and ArrayList
     */
    public PigGame(){
        die = new Die();
        players = new ArrayList<>();
    }

    /**
     * adding players to the game
     * @param player player to add to the game and arrayList
     */
    public void addPlayer(Player player){
        players.add(player);
    }

    /**
     * operation for finding the winner and the main runner of the game
     * @return the winner as a player object
     */
    public Player playGame(){
        Random generator = new Random();
        int first = generator.nextInt(players.size() - 1);
        players.add(0, players.get(first));
        players.remove(first + 1);
        boolean endGame = false;
        final int winScore = 100;
        int winner = 0;
        do{
            for (int i = 0; i < players.size(); i++){
                if(!endGame){
                    takeTurn(players.get(i));
                    endGame = players.get(i).getScore() >= winScore;
                    winner = i;
                }
            }
            System.out.println(toString());
        } while(!endGame);
        return players.get(winner);
    }

    /**
     * the toString method that formats the display for between turns
     * shows the scoreboard
     * @return String that shows the scoreboard
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Player p: players) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    private void takeTurn(Player player){
        boolean hold = false;
        int turnScore = 0;
        do{
            die.roll();
            System.out.println(player.getName()+" has rolled a "+die.getSideUp());
            if (die.getSideUp() != 1){
                turnScore += die.getSideUp();
                hold = player.chooseToHold(turnScore);
            } else {
                turnScore = 0;
                System.out.println(player.getName()+" busted.");
            }
        } while(die.getSideUp() != 1 && !hold);
        player.addToScore(turnScore);
    }
}

