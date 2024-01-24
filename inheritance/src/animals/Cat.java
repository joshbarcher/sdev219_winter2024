package animals;

public class Cat extends Mammal
{
    private boolean likesToPurr;
    private String breed;

    public Cat(String name, int age, String furColor,
               boolean likesToPurr, String breed)
    {
        super(name, age, furColor);

        this.likesToPurr = likesToPurr;
        this.breed = breed;
    }

    public boolean getLikesToPurr()
    {
        return likesToPurr;
    }

    public String getBreed()
    {
        return breed;
    }

    public String toString()
    {
        return super.toString() + " likes to purr? " + likesToPurr + ", breed: " + breed;
    }
}
