package driver;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean errors = true;
        while (errors)
        {
            try
            {
                String username = readString("Please enter a username (4-10 chars)", 4, 10);
                String password = readString("Please enter a password (8-12 chars)", 8, 12);
                int age = readInt("Enter your age (1-100)", 1, 100);

                System.out.println(username + " - " + password + " - " + age);
                errors = false; //exit the loop
            }
            catch (InputMismatchException ex) //specific catch
            {
                System.out.println("Please enter a valid integer");
                errors = true;
            }
            catch (Exception ex) //catch all
            {
                System.out.println(ex.getMessage());
                System.out.println("Please enter valid username and password");
                errors = true; //continue looping
            }
        }
    }

    public static int readInt(String prompt, int minValue, int maxValue)
    {
        //prompt
        System.out.println(prompt);

        //read in the user value
        int result = console.nextInt();
        console.nextLine(); //clear any extra characters in the scanner

        //validate the value
        if (result < minValue || result > maxValue)
        {
            throw new RuntimeException("Number should be in [" + minValue + ", " +
                    maxValue + "]");
        }

        return result;
    }

    public static String readString(String prompt, int minChars, int maxChars)
    {
        //prompt
        System.out.println(prompt);

        //read in the user value
        String result = console.nextLine();

        //validate the value
        if (result.length() < minChars || result.length() > maxChars)
        {
            throw new IllegalStateException("String should be of length [" +
                    minChars + ", " + maxChars + "]");
        }

        return result;
    }
}
