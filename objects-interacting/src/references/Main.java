package references;

import game.Player;
import game.dice.ColorDice;
import game.dice.Dice;

public class Main
{
    public static void main(String[] args)
    {
        //primitives copy values
        int num1 = 10;
        int num2 = num1;

        num1 = addTo(num1);
        num2 = addTo(num2);

        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);

        //objects copy references (aka pointers)
        /*Dice dice1 = new ColorDice("Blue", 6);
        Dice dice2 = new ColorDice("Orange", 6);

        Player p1 = new Player("Alex", dice1);
        Player p2 = new Player("Augy", dice2);

        System.out.println(p1.getDie());
        System.out.println(p2.getDie());

        //roll the dice and inspect both players dice sides
        rollDice(p1.getDie());
        System.out.println(p1.getDie().getValue());
        System.out.println(p2.getDie().getValue());*/
    }

    public static void rollDice(Dice die)
    {
        die.roll();
    }

    public static int addTo(int number)
    {
        number += 30;
        return number;
    }
}
