package game;

import game.dice.Dice;

/**
 * This class represents a player in a dice game.
 *
 * @version 1.0
 * @author Josh Archer
 * @author "SDEV 219 class"
 */
public class Player {

    /** The name of the player. */
    private String name;

    /** The die associated with the player. */
    private Dice die; //has-a relationship

    /**
     * Constructs a Player object with a specified name and die.
     *
     * @param name The name of the player.
     * @param die  The die associated with the player.
     */
    public Player(String name, Dice die) {
        this.name = name;
        this.die = die;
    }

    /**
     * Simulates rolling the die a specified number of times and calculates the total score.
     *
     * @param times The number of times the die should be rolled.
     * @return The total score obtained from rolling the die the specified number of times.
     */
    public int rollTimes(int times) {
        int score = 0;
        System.out.print(name + " rolled a ");
        for (int i = 1; i <= times; i++) {
            die.roll();
            System.out.print(die.getValue() + ", ");
            score += die.getValue();
        }
        System.out.println();
        System.out.println("Final score: " + score);
        System.out.println();

        return score;
    }

    /**
     * Simulates rolling the die ten times and calculates the total score.
     *
     * @return The total score obtained from rolling the die ten times.
     */
    public int rollTenTimes() {
        return rollTimes(10);
    }

    /**
     * Retrieves the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the die associated with the player.
     *
     * @return The die associated with the player.
     */
    public Dice getDie() {
        return die;
    }

    /**
     * Returns a string representation of the Player object.
     *
     * @return A string describing the player's name and the associated die.
     */
    public String toString() {
        return name + " has " + die.toString();
    }
}