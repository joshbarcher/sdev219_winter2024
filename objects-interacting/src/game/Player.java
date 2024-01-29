package game;

public class Player
{
    private String name;
    private Dice die; //has-a relationship

    public Player(String name, Dice die)
    {
        this.name = name;
        this.die = die;
    }

    public void rollTenTimes()
    {
        for (int i = 1; i <= 10; i++)
        {
            die.roll();
            System.out.println(name + " rolled a " + die.getValue());
        }
        System.out.println();
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name + " has " + die.toString();
    }
}
