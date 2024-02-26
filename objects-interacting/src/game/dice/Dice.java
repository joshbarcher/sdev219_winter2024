package game.dice;

import game.enums.DiceTypes;

import java.util.Random;

/**
 * This represents dice objects with sides of
 * 4, 6, 8, 10, 12, 20. You cannot instantiate
 * a die directly.
 *
 * @author Josh Archer
 * @author My SDEV 219 class
 * @version https://github.com/joshbarcher/sdev219_winter2024
 */
public abstract class Dice
{
    private int sides;
    private int value; //the side of the dice that is "up"

    //shared among all Dice objects
    private static int numDiceCreated;

    /**
     * This creates a new Dice object with the sides that
     * are provided by the parameter.
     *
     * @param sides the number of sides on the dice - must be one of
     *              [4, 6, 8, 10, 12, 20]
     */
    public Dice(int sides)
    {
        //traditional "table-top" sides are - 4, 6, 8, 10, 12, 20
        int[] validSides = {4, 6, 8, 10, 12, 20};
        boolean foundGoodSides = false;

        for (int i = 0; i < validSides.length; i++)
        {
            //did we find a valid match
            if (validSides[i] == sides)
            {
                foundGoodSides = true;
                break;
            }
        }

        if (foundGoodSides)
        {
            this.sides = sides;
        }
        else
        {
            throw new InvalidDiceException("A dice with " + sides +
                    " sides is not supported");
        }

        value = 1;
        numDiceCreated++;
    }

    /**
     * Creates a dice with the specified type.
     *
     * @param type the number of sides for the dice, using the DiceTypes enum
     */
    public Dice(DiceTypes type)
    {
        //compare the enum value passed into the constructor
        //against other enum values
        if (type == DiceTypes.FOUR)
        {
            sides = 4;
        } else if (type == DiceTypes.SIX)
        {
            sides = 6;
        } else if (type == DiceTypes.EIGHT)
        {
            sides = 8;
        } else if (type == DiceTypes.TEN)
        {
            sides = 10;
        } else if (type == DiceTypes.TWELVE)
        {
            sides = 12;
        } else if (type == DiceTypes.TWENTY)
        {
            sides = 20;
        } else
        {
            throw new RuntimeException("Dice type not recognized - " + type);
        }
        numDiceCreated++;
    }

    /**
     * This should randomly pick a side of the die.
     */
    public abstract void roll();

    /**
     * A getter for the sides field.
     *
     * @return the number of sides on the dice
     */
    public int getSides()
    {
        return sides;
    }

    /**
     * A getter for the value field.
     *
     * @return the current side of the dice that is "up"
     */
    public int getValue()
    {
        return value;
    }

    /**
     * A getter for the number of dice created with this class.
     * @return the number of dice created
     */
    public static int getNumDiceCreated()
    {
        return numDiceCreated;
    }

    /**
     * This assigns the value field, changing one side of the dice
     * to be in the "up" state
     * @param value the side of the dice that is "up"
     */
    public void setValue(int value)
    {
        if (value < 1 && value > sides)
        {
            throw new RuntimeException("Invalid dice value - " + value);
        }
        this.value = value;
    }

    /**
     * This gives a string representation of the dice.
     * @return a string representation of the dice
     */
    public String toString()
    {
        return "A " + sides + " sided dice (" + value + " side up)";
    }
}
