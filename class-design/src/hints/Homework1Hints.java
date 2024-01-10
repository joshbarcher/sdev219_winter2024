package hints;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework1Hints
{
    public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(new FileInputStream("files/numbers.txt"));

        String line = reader.nextLine();
        System.out.println(line);

        //String numInString = "100000"; //each character is 16-32 bits (unicode)
        //int number = 100000; //32 bits

        int num1 = Integer.parseInt(line);
        //double num2 = Double.parseDouble(line);

        if (num1 < 1000)
        {
            System.out.println("Less than 1000");
        }
    }
}
