package animals;

//parent class is Animal
public class Mammal extends Animal
{
    private String furColor;

    public Mammal(String name, int age, String furColor)
    {
        //call the parent parameterized constructor
        super(name, age);

        this.furColor = furColor;
    }

    public String getFurColor()
    {
        return furColor;
    }

    public String toString()
    {
        //everything that is public in the parent class
        //is available in this class (it's inherited)

        return "Mammal (" + getName()  + "): fur is " +
                furColor + " (" + getAge() + " years old)";
    }
}
