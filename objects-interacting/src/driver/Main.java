package driver;

import game.dice.ColorDice;
import game.dice.Dice;
import game.Player;
import game.dice.FixedDice;
import game.dice.WeightedDice;
import game.enums.DiceTypes;

public class Main
{
    public static void main(String[] args)
    {
        final int DICE_SIDES = 10;

        Dice p1Dice = new Dice(DiceTypes.SIX);
        Dice p2Dice = new Dice(DiceTypes.TEN);
        Player p1 = new Player("Job", p1Dice);
        Player p2 = new Player("Rose", p2Dice);

        //print out the player dice
        System.out.println("Player #1 has " + p1Dice.toString());
        System.out.println("Player #2 has " + p2Dice.toString());
        System.out.println();

        System.out.println("Starting the game!");
        System.out.println("------------------");
        System.out.println();

        playGame(p1, p2);
    }

    public static void playGame(Player p1, Player p2)
    {
        final int MATCH_ROLLS = 10;

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