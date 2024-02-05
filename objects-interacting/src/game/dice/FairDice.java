package game.dice;

import java.util.Random;

public class FairDice extends ColorDice
{
    public FairDice(String color, int sides)
    {
        super(color, sides);
    }

    public void roll()
    {
        Random random = new Random();
        setValue(random.nextInt(getSides()) + 1);
    }
}
