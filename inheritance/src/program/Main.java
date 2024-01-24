package program;

import animals.Animal;
import animals.Bird;
import animals.Cat;
import animals.Mammal;

public class Main
{
    public static void main(String[] args)
    {
        Animal cat = new Animal();
        Animal dog = new Animal("Maggie the Dog", 12);

        System.out.println(cat);
        System.out.println(dog);

        //try to use more specific classes
        Cat anotherCat = new Cat("Lazarus the cat", 2, "green", true, "somali");
        Bird bird = new Bird("Harry the hawk", 5, 2);

        System.out.println(anotherCat);
        System.out.println(bird);
    }
}
