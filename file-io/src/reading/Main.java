package reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //try-with-resources (close our resources automatically)
        try (Scanner reader = new Scanner(new FileInputStream("files/books/alice.txt")))
        {
            //while the scanner can read another line of text from the file
            int lineCount = 0;
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                lineCount++; //read another line

                //how many times does the name "Alice" show up in the file
                if (line.contains("Alice"))
                {
                    System.out.println("Line #" + lineCount + " contains the word 'Alice'");
                }

                //System.out.println(lineCount + ": " + line);
            }
            System.out.println("Lines in file: " + lineCount);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error reading: " + ex.getMessage());
        }
    }

    public static void readingTokens()
    {
        try (Scanner reader = new Scanner(new FileInputStream("files/contact.txt")))
        {
            reader.useDelimiter("\\|");

            //read in the 1st line from the file (using spaces as delimiters)
            String fName = reader.next();
            String middle = reader.next();
            String lName = reader.next();

            System.out.println("First: " + fName);
            System.out.println("Middle Initial: " + middle);
            System.out.println("Last: " + lName);
            reader.nextLine();

            int number = reader.nextInt();
            System.out.println("Address number: " + number);

            String address = reader.next();
            System.out.println("Address: " + number);

            String city = reader.next();
            System.out.println("City: " + city);

            String state = reader.next();
            System.out.println("State: " + state);

            int zip = reader.nextInt();
            System.out.println("Zip: " + zip);

            System.out.println(address + " " + city + " " + state + " " + zip);
            System.out.println(city);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error reading from file: " + ex.getMessage());
        }
    }
}
