package encounters;

import flights.FlightSchedule;

public class PeopleEncounters
{
    public static void main(String[] args)
    {
        //create (instantiate) a new encounter
        PersonalEncounter ash = new PersonalEncounter();

        //assign individual fields
        ash.name = "Ash";
        ash.encounters = 3;
        ash.phone = "(222)333-4444";
        ash.friend = false;

        //access individual fields
        System.out.println("I encountered " +
                ash.name + " " + ash.encounters +
                " times!");

        PersonalEncounter celina = new PersonalEncounter();
        celina.name = "Celina";
        celina.encounters = 1;

        System.out.println("I encountered " +
                celina.name + " " + celina.encounters +
                " times!");
    }
}