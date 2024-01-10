package flights;

import java.awt.Point;
import java.awt.Color;
import java.time.LocalDateTime;

public class FlightManager
{
    public static void main(String[] args)
    {
        Point point = new Point(3, 2);

        //instantiating the class!
        LocalDateTime depart = LocalDateTime.of(2024, 3, 2, 12, 30);
        FlightSchedule flight = new FlightSchedule("AL 3132",
                depart , 3, "New York");

        //access a private field using a public getter
        System.out.println("The flight to " + flight.getDestination() +
                " is " + flight.getLength() + " hours");

        /*flight.destination = "New York";
        flight.length = 3;
        flight.number = "AL 3132";
        flight.departure = LocalDateTime.of(2024, 3, 2, 12, 30);*/

        String pass = flight.createBoardingPass("Josh");
        System.out.println(pass);

        flight.generateFlightReport();

        //try creating a second flight and print the flight-report!
        FlightSchedule anotherFlight = new FlightSchedule();
        /*anotherFlight.destination = "Nigeria";
        anotherFlight.length = 9;
        anotherFlight.number = "AL 6987";
        anotherFlight.departure = LocalDateTime.of(2024, 6, 6, 12, 30);*/

        anotherFlight.generateFlightReport();
    }
}
