package game.dice;

import java.util.Random;

//this is more likely to score highly
public class WeightedDice extends ColorDice
{
    public WeightedDice(String color, int sides)
    {
        super(color, sides);
    }

    //purpose of this class is to weight rolls
    //(redefining the roll() method)
    public void roll()
    {
        Random random = new Random();
        int value1 = random.nextInt(getSides()) + 1;
        int value2 = random.nextInt(getSides()) + 1;

        if (value1 > value2)
        {
            setValue(value1);
        }
        else
        {
            setValue(value2);
        }
    }
}
