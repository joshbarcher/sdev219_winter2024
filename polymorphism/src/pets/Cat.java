package pets;

public class Cat extends Animal
{
    private String catBreed;

    public Cat(String catBreed, String name, String nickname)
    {
        super(name, nickname);
        this.catBreed = catBreed;
    }

    @Override
    public void petAnimal()
    {
        System.out.println("You pet the cat. Meoooowwww");
    }

    public void feed(String catFood)
    {

    }
}
