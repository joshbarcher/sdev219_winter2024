package driver;

import game.dice.Dice;

 /**
  * This class tests out different types of object references.
  *
  * @version 1.0
  * @author Josh Archer
  * @author "SDEV 219 class"
 */
public class References {

    /**
     * The main method to start the program.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
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

    /**
     * Simulates rolling a dice.
     *
     * @param die The dice to roll.
     */
    public static void rollDice(Dice die) {
        die.roll();
    }

    /**
     * Adds a value to a number.
     *
     * @param number The number to which to add the value.
     * @return The result of adding the value to the number.
     */
    public static int addTo(int number) {
        number += 30;
        return number;
    }
}