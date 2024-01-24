package animals;

//parent class is Animal
public class Bird extends Animal
{
    private double wingSpan; //feet

    public Bird(String name, int age, double wingSpan)
    {
        super(name, age);

        this.wingSpan = wingSpan;
    }

    public double getWingSpan()
    {
        return wingSpan;
    }

    public String toString()
    {
        return "Bird: wingspan of " +
                wingSpan + " feet";
    }
}
