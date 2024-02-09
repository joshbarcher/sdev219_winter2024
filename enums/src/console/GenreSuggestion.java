package console;

import enums.Genres;

public class GenreSuggestion
{
    public static void main(String[] args)
    {
        //print out the genres for the user
        Genres[] genres = Genres.values();
        System.out.println("Here are the support genres:");
        for (int i = 0; i <= genres.length - 1; i++)
        {
            System.out.print(genres[i] + ", ");
        }
        System.out.println("(case sensitive)");

        //ask the user to choose a genre
        String userChoice = Console.getString("Enter a genre");
        Genres userGenre = Genres.valueOf(userChoice);
        System.out.println("You chose " + userGenre);

        //suggest a movie
        /*if (userGenre == Genres.FANTASY)
        {
            System.out.println("The Lord of the Rings");
        }
        else if (userGenre == Genres.ACTION)
        {
            System.out.println("Avatar");
        }
        else if (userGenre == Genres.ROMANCE)
        {
            System.out.println("10 Things I Hate About You");
        }*/

        System.out.println(userGenre.getSuggestedMovie());
    }
}
