package game.dice;

/**
 * This class represents a fixed dice, inheriting from the ColorDice class.
 * A fixed dice always comes up with the same side after being rolled.
 *
 * @version 1.0
 * @author Josh Archer
 * @author "SDEV 219 class"
 */
public class FixedDice extends ColorDice {

    /**
     * Constructs a FixedDice object with a specified color and number of sides.
     *
     * @param color The color of the dice.
     * @param sides The number of sides on the dice.
     */
    public FixedDice(String color, int sides) {
        super(color, sides);
    }

    /**
     * Overrides the roll method to set the value of the dice to the maximum side.
     * A fixed dice always returns the same side after being rolled.
     */
    @Override
    public void roll() {
        setValue(getSides());
    }
}