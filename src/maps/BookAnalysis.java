package maps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class BookAnalysis
{
    public static void main(String[] args)
    {
        try (Scanner reader = new Scanner(new FileInputStream("books/book.txt")))
        {
            TreeMap<String, Integer> wordsMap = new TreeMap<>();

            while (reader.hasNextLine())
            {
                //get a line of the file
                String line = reader.nextLine();

                //break up the line into words
                String[] words = line.split(" ");

                for (String word : words)
                {
                    //first time seeing the word?
                    if (!wordsMap.containsKey(word))
                    {
                        wordsMap.put(word, 1); //add
                    }
                    else
                    {
                        //not the first time, increment the count
                        int currentCount = wordsMap.get(word);
                        currentCount++;
                        wordsMap.put(word, currentCount); //update
                    }
                }
            }

            //loop and print out word counts
            for (String word : wordsMap.keySet())
            {
                int wordCount = wordsMap.get(word);

                System.out.println(word + " -> " + wordCount + " times");
            }

            System.out.println();
            System.out.println("We found " + wordsMap.size() + " words!");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error reading: " + ex.getMessage());
        }
    }
}
