package arrays;

public class TwoDimensionArrays
{
    public static void main(String[] args)
    {
        //sports, books, movies, music
        String[][] thingsILike = new String[4][2];

        //sports
        thingsILike[0][0] = "Basketball";
        thingsILike[0][1] = "Baseball";

        //books
        thingsILike[1][0] = "A Game Of Thrones";
        thingsILike[1][1] = "Dune";

        //movies
        thingsILike[2][0] = "10 Things I Hate About You";
        thingsILike[2][1] = "The Fellowship of the Ring";

        //music
        thingsILike[3][0] = "Fire on Fire";
        thingsILike[3][1] = "Somebody That I Used To Know";

        System.out.println("A book I like " + thingsILike[1][0]);
    }
}
