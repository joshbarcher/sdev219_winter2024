package arrays;

public class Car implements Comparable<Car>
{
    private String type;
    private String color;
    private int milesDriven;
    private int year;
    private double mpg;

    public Car(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return "Car: " + type;
    }

    @Override
    public int compareTo(Car anotherCar)
    {
        return type.compareTo(anotherCar.type);
    }
}
