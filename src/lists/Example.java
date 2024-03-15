package lists;

import java.util.ArrayList;

public class Example
{
    public static void main(String[] args)
    {
        ArrayList<String> books = new ArrayList<String>();

        books.add("The Fellowship of the Ring");
        books.add("Leviathan Awakes");
        books.add("Red Rising");
        books.add("A Game of Thrones");
        books.add("Prince of Nothing");

        for (int i = 0; i < books.size(); i++)
        {
            System.out.println(books.get(i));
        }

        //books.clear();

        int size = books.size();
        for (int i = 0; i < size; i++)
        {
            books.remove(0);
        }

        System.out.println("Books list empty? " + books.isEmpty());

        for (int i = 0; i < books.size(); i++)
        {
            System.out.println(books.get(i));
        }
    }
}
