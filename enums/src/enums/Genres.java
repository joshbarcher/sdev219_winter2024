package enums;

public enum Genres
{
    THRILLER("V for Vendetta"),
    ACTION("Die Hard"),
    ROMANCE("10 Things I Hate About You"),
    COMEDY("Dave Chappelle Comedy"),
    FANTASY("The Lord of the Rings"),
    SCIFI("The Expanse"),
    HISTORICAL("Napoleon"),
    HORROR("IT"),
    DOCUMENTARY("World War 2 Documentary");

    private String suggestedMovie;

    private Genres(String suggestedMovie)
    {
        this.suggestedMovie = suggestedMovie;
    }

    public String getSuggestedMovie()
    {
        return suggestedMovie;
    }

/*    public String toString()
    {
        return "I suggest " + suggestedMovie;
    }*/
}
