package arrays;

import java.util.Arrays;

public class TwoDimensionArrays
{
    public static void main(String[] args)
    {
        //sports, books, movies, music, recipes
        String[][] thingsILike2 = new String[4][2];

        thingsILike2[0] = new String[] {"Basketball", "Baseball"};
        thingsILike2[1] = new String[] {"A Game Of Thrones", "Dune"};
        thingsILike2[2] = new String[] {"Avatar", "John Wick"};
        thingsILike2[3] = new String[] {"Fire on Fire", "Somebody That I Used To Know"};

        String[][] thingsILike = {
            {"Basketball", "Baseball"},
            {"A Game Of Thrones", "Dune", "Red Rising", "Prince of Nothing", "IT"},
            {"Avatar", "John Wick", "Princess Bride"},
            {"Fire on Fire", "Somebody That I Used To Know", "Invincible"},
            {"Carne Asada"}
        };

        //sports
        //thingsILike[0][0] = "Basketball";
        //thingsILike[0][1] = "Baseball";


        //books
        //thingsILike[1][0] = "A Game Of Thrones";
        //thingsILike[1][1] = "Dune";

        //movies
        //thingsILike[2][0] = "Avatar";
        //thingsILike[2][1] = "John Wick";

        //music
        //thingsILike[3][0] = "Fire on Fire";
        //thingsILike[3][1] = "Somebody That I Used To Know";

        //System.out.println("A book I like " + thingsILike[1][0]);

        //print out all the things I like
        for (int i = 0; i < thingsILike.length; i++) //rows
        {
            System.out.println("Things I like:");
            for (int j = 0; j < thingsILike[i].length; j++) //cols
            {
                System.out.println(thingsILike[i][j]);
            }
            System.out.println();
        }
    }
}
