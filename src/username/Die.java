/*
 * Course: CSC1110 - 131
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Andrew keenan
 * Created: 11-13-23
 */
package keenana;

import java.util.Random;

/**
 * This is a die class that simulates a Die object
 * the constructors make the die and the roll() method
 * rolls the die based on the amount of sides
 */
public class Die {
    private static final int MIN_SIDES = 2;
    private static final int MAX_SIDES = 100;
    private static final int DEFAULT_SIDES = 6;
    private static final Random generator = new Random();
    private final int numSides;
    private int currentValue;

    /**
     * default constructor for a die
     */
    public Die(){
        numSides = DEFAULT_SIDES;
        roll();
    }

    /**
     * constructor where the amount of sides is controlled
     * @param numSides the number of sides the user wishes the die to have
     */
    public Die(int numSides){
        if (numSides < MIN_SIDES || numSides > MAX_SIDES){
            this.numSides = DEFAULT_SIDES;
        } else {
            this.numSides = numSides;
        }
        roll();
    }
    public int getSideUp(){
        return currentValue;
    }

    /**
     * Rolls the die and sets the current value to the random number it rolls
     */
    public void roll(){
        currentValue = generator.nextInt(1, this.numSides);
    }
}
