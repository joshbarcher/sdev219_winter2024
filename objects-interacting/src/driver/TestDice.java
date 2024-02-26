package driver;

import game.dice.ColorDice;
import game.dice.Dice;
import game.dice.FairDice;

/**
 * This class contains simple tests for creating Dice objects.
 *
 * @version 1.0
 * @author Josh Archer
 * @author "SDEV 219 class"
 */
public class TestDice {

    /**
     * The main method to start the program.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Dice die1 = new FairDice("Red", 7);
        Dice die2 = new FairDice("Orange", 4);

        die1.roll();

        System.out.println(die1);
        System.out.println(die2);
    }
}
