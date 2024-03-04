package reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //try-with-resources (close our resources automatically)
        try (Scanner reader = new Scanner(new FileInputStream(
                "files/books/moby-dick.txt")))
        {
            //while the scanner can read another line of text from the file
            int lineCount = 0;
            int aliceCounter = 0;
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                lineCount++; //read another line

                //how many times does the name "Alice" show up in the file
                String[] words = line.split(" ");

                //how many elements are in the words array?
                int aliceOnCurrentLine = 0;
                for (int i = 0; i < words.length; i++)
                {
                    String singleWord = words[i];

                    //try to convert a word to a number (if possible)
                    try
                    {
                        double number = Double.parseDouble(singleWord);
                        System.out.println("Found a number: " +
                                lineCount + ": " + line);
                    }
                    catch (NumberFormatException ex)
                    {
                        //what do I do here?
                    }

                    if (singleWord.contains("Moby"))
                    {
                        aliceCounter++;
                        aliceOnCurrentLine++;
                    }
                }

                //print out the line if the line has more than one "Alice" in the line
                if (aliceOnCurrentLine > 1)
                {
                    System.out.println("Multiple Alice's Found: " +
                            lineCount + ": " + line);
                }

                /*if (line.contains("Alice"))
                {
                    System.out.println("Line #" + lineCount +
                            " contains the word 'Alice'");
                    aliceCounter++;
                }*/

                //System.out.println(lineCount + ": " + line);
            }
            System.out.println("Lines in file: " + lineCount);
            System.out.println("Found the name 'Alice' " + aliceCounter + " times!");
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
