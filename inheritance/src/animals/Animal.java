package animals;

//attributes and actions shared by animals of all types
//(parent class)
public class Animal
{
    private String name;
    private int age;

    public Animal()
    {
        name = "Fuzzy the Calico Cat";
        age = 5;
    }

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    //why write a toString() method?
    @Override
    public String toString()
    {
        return "Name: " + name + " (" + age + " years old)";
    }
}
