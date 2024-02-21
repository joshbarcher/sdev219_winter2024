package game.dice;

import game.enums.Colors;
import game.enums.DiceTypes;

import java.util.Random;

/**
 * This abstract class represents a colored dice, which extends the functionality of a standard dice.
 * It provides methods to retrieve the color of the dice and a string representation of the dice.
 * @version 1.0
 * @author Josh Archer
 * @author "SDEV 219 class"
 */
public abstract class ColorDice extends Dice {

    /** The color of the dice. */
    private String color;

    /**
     * Constructs a ColorDice object with a specified color and number of sides.
     *
     * @param color The color of the dice.
     * @param sides The number of sides on the dice.
     */
    public ColorDice(String color, int sides) {
        super(sides);
        this.color = color;
    }

    /**
     * Constructs a ColorDice object with a specified color and type of dice.
     *
     * @param color The color of the dice.
     * @param type  The type of the dice.
     */
    public ColorDice(Colors color, DiceTypes type) {
        super(type);
        this.color = color.name().toLowerCase();
    }

    /**
     * Retrieves the color of the dice.
     *
     * @return The color of the dice.
     */
    public String getColor() {
        return color;
    }

    /**
     * Returns a string representation of the ColorDice object.
     *
     * @return A string describing the color and number of sides of the dice.
     */
    public String toString() {
        return "A " + color + " " + getSides() + " sided dice";
    }
}
