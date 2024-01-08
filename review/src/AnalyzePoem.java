import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class AnalyzePoem
{
    //we are ignoring error-handling (for now)
    public static void main(String[] args) throws Exception
    {
        Scanner fileReader = new Scanner(new FileInputStream("poem.txt"));

        //while there are more lines to read
        int count = 0;
        while (fileReader.hasNextLine())
        {
            //read a line from the file
            String line = fileReader.nextLine();
            count++;

            //System.out.println(line);

            //remove all commas from the current line
            line = line.replace(",", "");
            line = line.replace(".", "");

            System.out.println("Line #" + count);

            String[] words = line.split(" ");
            System.out.println("Words: " + Arrays.toString(words));
            System.out.println("Found " + words.length + " words");

            System.out.println(line);
            System.out.println();
        }

        System.out.println(); //newline
        System.out.println("I read " + count + " lines in the file");
    }
}
