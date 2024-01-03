import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    //make it private, we'll explain later!
    private static Scanner scanner = new Scanner(System.in);

    //we want to break up our methods to avoid "god methods"
    public static void main(String[] args)
    {
        //prompt and read in two values
        double[] nums = getTwoNums();

        double result = add(nums[0], nums[1]);
        System.out.println("Result - " + result);
    }

    //write a method that asks the user for both numbers and returns them
    public static double[] getTwoNums()
    {
        double first = getUserNum("Enter a number: ");
        double second = getUserNum("Enter a number: ");

        return new double[] {first, second};
    }

    public static double getUserNum(String prompt)
    {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double add(double one, double two)
    {
        return one + two;
    }
}