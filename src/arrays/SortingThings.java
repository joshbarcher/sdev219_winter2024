package arrays;

import java.util.Arrays;

public class SortingThings
{
    public static void main(String[] args)
    {
        int[] numbers = {42, 17, 34, 26, 47};
        String[] words = {"bamboozle", "bingo", "rad", "follow", "pineapple"};
        Car[] cars = {
            new Car("Suzuzi Esteem"),
            new Car("Nissan Rogue"),
            new Car("Nissan Altima")
        };

        //before
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(cars));

        Arrays.sort(numbers);
        Arrays.sort(words);
        Arrays.sort(cars);

        //after
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(cars));
    }
}
