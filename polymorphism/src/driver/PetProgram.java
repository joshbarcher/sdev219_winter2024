package driver;

import objects.Wallet;
import pets.Animal;
import pets.Cat;
import pets.Dog;
import pets.Lizard;

import java.util.ArrayList;

public class PetProgram
{
    public static void main(String[] args)
    {
        //an example of upcasting (variable type - parent class
        //object type - child class)
        Animal laz = new Cat("Somali", "Lazarus", "Lazzie");
        Animal bella = new Dog("Bella", "Bella");
        Animal sandy = new Lizard("Sandy", "Sandy");

        Animal[] animals = { laz, bella, sandy };
        for (int i = 0; i < animals.length; i++)
        {
            animals[i].petAnimal();
        }

        ArrayList list = new ArrayList();
        Wallet wallet = new Wallet();

        printSomething(laz);
        printSomething(bella);
        printSomething("Hello");
        printSomething(list);
        printSomething(10);
        printSomething(true);
        printSomething(wallet);
    }

    public static void printSomething(Object object)
    {
        System.out.println(object.toString());
    }
}
