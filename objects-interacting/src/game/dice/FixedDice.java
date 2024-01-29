package game.dice;

//always roll the max (give this to Job)
public class FixedDice extends ColorDice
{
    public FixedDice(String color, int sides)
    {
        super(color, sides);
    }

    //override roll
    public void roll()
    {
        setValue(getSides());
    }
}
