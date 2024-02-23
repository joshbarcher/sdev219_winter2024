package console;

import enums.PetType;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        PetType[] types = PetType.values();
        System.out.println(Arrays.toString(types));

        for (int i = 0; i < types.length; i++)
        {
            System.out.println(types[i]);
        }
    }
}
