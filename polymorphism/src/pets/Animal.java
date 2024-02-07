package pets;

public abstract class Animal
{
    private String name;
    private String nickname;

    public Animal(String name, String nickname)
    {
        this.name = name;
        this.nickname = nickname;
    }

    public abstract void petAnimal();

    public String toString()
    {
        return name + " (" + nickname + ")";
    }
}
