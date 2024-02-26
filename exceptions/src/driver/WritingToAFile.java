package driver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WritingToAFile
{
    public static void main(String[] args)
    {
        try
        {
            writeToFile();
            writeToFile("From the other method...");
            writeToFile("From the other method...");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
        finally
        {
            fileWriter.close();
            System.out.println("All done!");
        }
    }

    public static void writeToFile() throws FileNotFoundException
    {
        PrintWriter fileWriter = new PrintWriter(
                new FileOutputStream("output.txt", true), true);
        fileWriter.println("Hello, from SDEV 219");
        fileWriter.println(42);
    }

    public static void writeToFile(String message) throws FileNotFoundException
    {
        PrintWriter fileWriter = new PrintWriter(
                new FileOutputStream("output.txt", true), true);
        fileWriter.println(message);
    }
}
