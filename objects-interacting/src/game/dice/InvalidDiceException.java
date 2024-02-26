package game.dice;

public class InvalidDiceException extends RuntimeException
{
    public InvalidDiceException()
    {
        super("An invalid dice was encountered");
    }

    public InvalidDiceException(String message)
    {
        super(message);
    }
}
