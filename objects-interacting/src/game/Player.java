package game;

import game.dice.Dice;

public class Player
{
    private String name;
    private Dice die; //has-a relationship

    public Player(String name, Dice die)
    {
        this.name = name;
        this.die = die;
    }

    //we want to follow the DRY (don't repeat yourself) principle
    public int rollTimes(int times)
    {
        int score = 0;
        System.out.print(name + " rolled a ");
        for (int i = 1; i <= times; i++)
        {
            die.roll();
            System.out.print(die.getValue() + ", ");
            score += die.getValue();
        }
        System.out.println();
        System.out.println("Final score: " + score);
        System.out.println();

        return score;
    }

    public int rollTenTimes()
    {
        return rollTimes(10);
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
