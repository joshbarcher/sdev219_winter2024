package game.dice;

import game.enums.Colors;
import game.enums.DiceTypes;

public class ColorDice extends Dice
{
    private String color;

    public ColorDice(String color, int sides)
    {
        super(sides);

        this.color = color;
    }

    public ColorDice(Colors color, DiceTypes type)
    {
        super(type);

        this.color = color.name().toLowerCase();
    }

    public String getColor()
    {
        return color;
    }

    //this redefines toString() from the Dice (parent) class
    public String toString()
    {
        return "A " + color  + " " + getSides() + " sided dice";
    }
}
