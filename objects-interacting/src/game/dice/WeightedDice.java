package game.dice;

import java.util.Random;

/**
 * This class represents a weighted dice, inheriting from the ColorDice class.
 * A weighted dice is more likely to roll a higher number compared to a fair dice.
 *
 * @version 1.0
 * @author Josh Archer
 * @author "SDEV 219 class"
 */
public class WeightedDice extends ColorDice {

    /**
     * Constructs a WeightedDice object with a specified color and number of sides.
     *
     * @param color The color of the dice.
     * @param sides The number of sides on the dice.
     */
    public WeightedDice(String color, int sides) {
        super(color, sides);
    }

    /**
     * Overrides the roll method to simulate rolling a weighted dice.
     * The dice rolls twice, and the value of the dice is set to the higher of the two rolls.
     * This makes higher values more likely to occur compared to lower values.
     */
    @Override
    public void roll() {
        Random random = new Random();
        int value1 = random.nextInt(getSides()) + 1;
        int value2 = random.nextInt(getSides()) + 1;

        if (value1 > value2) {
            setValue(value1);
        } else {
            setValue(value2);
        }
    }
}
