package driver;

import pets.Animal;
import pets.Cat;
import pets.Dog;
import pets.Lizard;

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
    }
}
