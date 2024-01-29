package driver;

import game.dice.ColorDice;
import game.dice.Dice;
import game.Player;

public class Main
{
    public static void main(String[] args)
    {
        /*Dice die = new Dice(10);
        System.out.println(die);

        for (int i = 0; i < 20; i++)
        {
            die.roll();
            System.out.println("Die came up " + die.getValue());
        }*/

        final int MATCH_ROLLS = 5;

        ColorDice p1Dice = new ColorDice("Red", 6);
        ColorDice p2Dice = new ColorDice("Blue", 6);
        Player p1 = new Player("Job", p1Dice);
        Player p2 = new Player("Rose", p2Dice);

        System.out.println("Starting the game!");
        System.out.println("------------------");
        System.out.println();

        //print out the player dice
        System.out.println("Player #1 has " + p1Dice.toString());
        System.out.println("Player #2 has " + p2Dice.toString());
        System.out.println();

        int p1Score = p1.rollTimes(MATCH_ROLLS);
        int p2Score = p2.rollTimes(MATCH_ROLLS);

        //compare scores...
        if (p1Score < p2Score)
        {
            System.out.println("The winner is " + p2.getName());
        }
        else if (p2Score < p1Score)
        {
            System.out.println("The winner is " + p1.getName());
        }
        else
        {
            System.out.println("It was a tie!");
        }
    }
}