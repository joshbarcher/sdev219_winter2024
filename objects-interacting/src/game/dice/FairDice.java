package game.dice;

import java.util.Random;

/**
 * This class represents a fair dice, inheriting from the ColorDice class.
 * A fair dice is one that is fair with respect to randomness, providing an equal chance for each side to appear.
 *
 * @version 1.0
 * @author Josh Archer
 * @author "SDEV 219 class"
 */
public class FairDice extends ColorDice {

    /**
     * Constructs a FairDice object with a specified color and number of sides.
     *
     * @param color The color of the dice.
     * @param sides The number of sides on the dice.
     */
    public FairDice(String color, int sides) {
        super(color, sides);
    }

    /**
     * Simulates rolling the fair dice and sets the value of the dice to the result.
     * The result is a random number between 1 and the number of sides, inclusive.
     */
    public void roll() {
        Random random = new Random();
        int roll = random.nextInt(getSides()) + 1;
        setValue(roll);
    }
}