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
            //just assign a default
            System.out.println("Invalid dice side, defaulting to six");
            this.sides = 6;
        }

        value = 1;
        numDiceCreated++;
    }

    public Dice(DiceTypes type)
    {
        //compare the enum value passed into the constructor
        //against other enum values
        if (type == DiceTypes.FOUR){ sides = 4; }
        else if (type == DiceTypes.SIX) { sides = 6; }
        else if (type == DiceTypes.EIGHT) { sides = 8; }
        else if (type == DiceTypes.TEN) { sides = 10; }
        else if (type == DiceTypes.TWELVE) { sides = 12; }
        else if (type == DiceTypes.TWENTY) { sides = 20; }

        numDiceCreated++;
    }

    public abstract void roll();

    public int getSides()
    {
        return sides;
    }

    public int getValue()
    {
        return value;
    }

    //getter for our static field
    public static int getNumDiceCreated()
    {
        return numDiceCreated;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    //this redefines toString() from the ??? (parent) class
    public String toString()
    {
        return "A " + sides + " sided dice (" + value + " side up)";
    }
}
