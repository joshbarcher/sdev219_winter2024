package flights;

import java.time.LocalDateTime;

public class FlightSchedule
{
    //ALA 200,  DEL 313
    private String number;
    private LocalDateTime departure;
    private double length; //in hours
    private String destination;

    //default
    public FlightSchedule()
    {
        number = "Delta 9999";
        departure = LocalDateTime.now();
        length = 1;
        destination = "Victoria";
    }

    //parameterized
    public FlightSchedule(String flightNum, LocalDateTime departureTime,
                          double flightLength, String dest)
    {
        number = flightNum;
        departure = departureTime;
        length = flightLength;
        destination = dest;
    }

    //getters (aka accessors)
    public String getDestination()
    {
        return destination.toUpperCase();
    }

    public String getNumber()
    {
        return number;
    }

    public double getLength()
    {
        return length;
    }

    //method that does something
    public void generateFlightReport()
    {
        System.out.println("Flight #" + number);
        System.out.println("Departs at " + departure);
        System.out.println("Flight length is " + length + " hours");
    }

    public void registerDelay(double delayHours)
    {
        length += delayHours;
    }

    //method that produces something
    public String createBoardingPass(String flyerName)
    {
        String pass = "-----------------------------\n";
        pass += "Flyer: " + flyerName + "\n";
        pass += "Destination: " + destination + "\n";

        return pass;
    }
}
