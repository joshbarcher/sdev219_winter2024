package driver;

import game.dice.*;
import game.Player;
import game.enums.Colors;
import game.enums.DiceTypes;
import game.enums.GameType;

import java.util.Random;

/**
 * This class contains methods to play a game of dice of different types.
 *
 * @version 1.0
 * @author Josh Archer
 * @author "SDEV 219 class"
 */
public class Main {

    /**
     * The main method to start the program.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        //a static method is called on a class
        //Main.main(new String[0]);

        //an instance (non-static) method is called on a object
        Main myProgram = new Main();
        myProgram.gameIntro();
    }

    /**
     * Displays the game introduction and initiates the game.
     */
    public void gameIntro() {
        final int DICE_SIDES = 10;
        final GameType GAME_TYPE = GameType.HIGH_SCORE;

        try {
            Dice p1Dice = new FairDice("Blue", 7);
            Dice p2Dice = new WeightedDice("Orange", 10);
            Dice anotherDice = new FixedDice("red", 10);

            //calling a method using the class name is referred to as
            //"calling a method statically"
            System.out.println("Num dice is " + Dice.getNumDiceCreated());

            Player p1 = new Player("Job", p1Dice);
            Player p2 = new Player("Rose", p2Dice);

            //print out the player dice
            System.out.println("Player #1 has " + p1Dice.toString());
            System.out.println("Player #2 has " + p2Dice.toString());
            System.out.println();

            System.out.println("Starting the game!");
            System.out.println("------------------");
            System.out.println();

            if (GAME_TYPE == GameType.HIGH_SCORE) {
                playHighScore(p1, p2);
            } else if (GAME_TYPE == GameType.TARGET_NUMBER) {
                playTargetNumber(p1, p2);
            } else {
                System.out.println("Game type not yet implemented!");
            }
        } catch (RuntimeException ex) {
            System.out.println("Something went wrong! " + ex.getMessage());
        }
    }

    /**
     * Plays a game where players try to roll a target number.
     *
     * @param p1 The first player.
     * @param p2 The second player.
     */
    public void playTargetNumber(Player p1, Player p2) {
        //pick our target number
        p1.getDie().roll();
        int target = p1.getDie().getValue();
        System.out.println("Target number is " + target);
        System.out.println();

        boolean gameOver = false;
        while (!gameOver) {
            //both players will roll
            p1.getDie().roll();
            p2.getDie().roll();

            int p1Roll = p1.getDie().getValue();
            int p2Roll = p2.getDie().getValue();
            System.out.println("Player #1 rolled a " + p1Roll);
            System.out.println("Player #2 rolled a " + p2Roll);
            System.out.println();

            //check if someone won
            if (p1Roll == target && p2Roll == target) {
                System.out.println("The game was a tie!");
                gameOver = true;
            } else if (p1Roll == target) {
                System.out.println("Player #1 won!");
                gameOver = true;
            } else if (p2Roll == target) {
                System.out.println("Player #2 won!");
                gameOver = true;
            }
        }
    }

    /**
     * Plays a game where players try to achieve the highest score in a fixed number of rolls.
     *
     * @param p1 The first player.
     * @param p2 The second player.
     */
    public void playHighScore(Player p1, Player p2) {
        final int MATCH_ROLLS = 10;

        int p1Score = p1.rollTimes(MATCH_ROLLS);
        int p2Score = p2.rollTimes(MATCH_ROLLS);

        //compare scores...
        if (p1Score < p2Score) {
            System.out.println("The winner is " + p2.getName());
        } else if (p2Score < p1Score) {
            System.out.println("The winner is " + p1.getName());
        } else {
            System.out.println("It was a tie!");
        }
    }
}