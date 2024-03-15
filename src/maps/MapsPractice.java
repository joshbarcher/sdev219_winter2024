package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsPractice
{
    public static void main(String[] args)
    {
        HashMap<String, String> favoriteFoods = new HashMap<>();

        favoriteFoods.put("Josh", "Carne Asada");
        favoriteFoods.put("Ash", "Chile Rellenos");
        favoriteFoods.put("Jonathan", "Refried Beans");
        favoriteFoods.put("Laura", "Waffles");
        favoriteFoods.put("Obiwan", "Burritos");
        favoriteFoods.put("Chewbacca", "Pizza");
        favoriteFoods.put("Josh", "Chicken Pot Pie");
        favoriteFoods.put("Jared", "Chicken Pot Pie");

        //we provide a key to look up a value
        String food = favoriteFoods.get("Ash");
        System.out.println("Ash has a favorite food of " + food);
        System.out.println("Laura has a favorite food of " +
                favoriteFoods.get("Laura"));
        System.out.println("Jonathan has a favorite food of " +
                favoriteFoods.get("Jonathan"));
        System.out.println("Josh has a favorite food of " +
                favoriteFoods.get("Josh"));

        //query to see if a key or value exists
        System.out.println("Is Obiwan in the map? " +
                favoriteFoods.containsKey("Obiwan"));
        System.out.println("Is R2D2 in the map? " +
                favoriteFoods.containsKey("R2D2"));

        if (favoriteFoods.containsKey("Chewbacca"))
        {
            System.out.println("Careful around the big furry guy!");
        }

        if (favoriteFoods.containsValue("Waffles"))
        {
            System.out.println("Someone loves waffles!");
        }
        System.out.println();

        //loop over the keys
        for (String key : favoriteFoods.keySet())
        {
            System.out.println("Key: " + key);
        }
        System.out.println();

        //loop over the values
        for (String value : favoriteFoods.values())
        {
            System.out.println("Value: " + value);
        }
        System.out.println();

        //loop over the pairs
        for (Map.Entry<String, String> entry : favoriteFoods.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
    }
}
