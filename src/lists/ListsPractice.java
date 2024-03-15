package lists;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ListsPractice
{
    public static void main(String[] args)
    {
        ArrayList<Double> listOfNums = new ArrayList<Double>();

        //store 1,000,000 random numbers
        for (int i = 1; i <= 1_000_000; i++)
        {
            double randNum = Math.random();
            listOfNums.add(Math.random());
        }

        int numElements = listOfNums.size();
        for (int i = 0; i < numElements; i++)
        {
            listOfNums.remove(0);
        }

        for (int i = 0; i < listOfNums.size(); i++)
        {
            double number = listOfNums.get(i);
        }


        System.out.println("Removed all elements!");
    }

    private static void foo2()
    {
        int[] numbers = {34, 11, 77, 32, 42, 13, 64, 21, 68};

        //is the number 42 in the array?
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 42)
            {
                System.out.println("Found it!");
            }
        }

        String[] words = {"eschew", "bamboozled", "ontological",
                "quintessential", "audacity", "indemnification"};

        //is the word "quintessential" in the array?
        for (int i = 0; i < words.length; i++)
        {
            if (words[i].equals("ontological"))
            {
                System.out.println("Found it!");
            }
        }

        ArrayList<String> wordsList = new ArrayList<String>();

        wordsList.add("anathema");
        wordsList.add("cacophony");
        wordsList.add("hullaballoo");
        wordsList.add("whippersnapper");
        wordsList.add("biblioklept");

        //syntactic sugar (there is an underlying mechanism - called an iterator)
        for (String word : wordsList)
        {
            System.out.println("Found a word - " + word);
        }

        boolean containsWord = wordsList.contains("lollygag");
        if (containsWord)
        {
            System.out.println("Found hullaballoo");
        }
    }

    private static void foo()
    {
        int[] numsArray = new int[10];
        String[] stringsArray = new String[20];

        /*
            int -> Integer
            double -> Double
            char -> Character
            boolean -> Boolean
            ...
         */
        ArrayList<Double> listOfNums = new ArrayList<Double>();

        System.out.println("Generating numbers...");
        System.out.println(LocalDateTime.now());

        //store 1,000,000 random numbers
        for (int i = 1; i <= 1_000_000; i++)
        {
            double randNum = Math.random();
            listOfNums.add(Math.random());
        }

        //print out the numbers (the wrong way!)
        /*for (int i = 0; i < listOfNums.length; i++)
        {
            System.out.println(listOfNums[i]);
        }*/

        /*for (int i = 0; i < listOfNums.size(); i++)
        {
            System.out.println(listOfNums.get(i));
        }*/

        //listOfNums.add("hello"); //use the String class
        //listOfNums.add(true); //use the Boolean class
        //listOfNums.add(new Car());

        //boxing and unboxing
        double firstElement = listOfNums.get(0);
        System.out.println("The first element is " + firstElement);

        System.out.println("All done!");
        System.out.println(LocalDateTime.now());
    }
}
