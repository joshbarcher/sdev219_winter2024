package writing;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //the true passed to the FileOutputStream constructor
        //turns on "append" mode
        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("files/output2.txt", true)))
        {
            writer.println("Hello");
            writer.println("class");
            writer.println("!");
            writer.println(100);
            writer.println(3.1234234);

            Point point = new Point(1.2, 3.6);
            writer.println(point);
            System.out.println(point);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
    }
}