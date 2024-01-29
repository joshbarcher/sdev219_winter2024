package driver;

import game.Dice;
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

        Player p1 = new Player("Job", new Dice(10));
        Player p2 = new Player("Rose", new Dice(10));

        System.out.println("Starting the game!");
        System.out.println("------------------");
        System.out.println();

        p1.rollTenTimes();
        p2.rollTenTimes();
    }
}