package phones;

public class CellPhone
{
    private String brand;
    private int volume;
    private String chargingPort;
    private double storageInGigs;

    //example: method overloading
    public CellPhone()
    {
        this("IPhone", 0, "usb-c", 128);
    }

    public CellPhone(String brand)
    {
        //this calls the constructor below
        this(brand, 0, "usb-c", 128);
    }

    public CellPhone(String brand, int volume,
                     String chargingPort, double storageInGigs)
    {
        this.brand = brand;
        this.volume = volume;
        this.chargingPort = chargingPort;
        this.storageInGigs = storageInGigs;
    }

    public String getBrand()
    {
        return brand.toUpperCase();
    }

    public int getVolume()
    {
        return volume;
    }

    public String getChargingPort()
    {
        return chargingPort;
    }

    public double getStorageInGigs()
    {
        return storageInGigs;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setVolume(int volume)
    {
        if (volume >= 0 && volume <= 10)
        {
            this.volume = volume;
        }
    }

    public void setChargingPort(String chargingPort)
    {
        this.chargingPort = chargingPort;
    }

    public void setStorageInGigs(double storageInGigs)
    {
        this.storageInGigs = storageInGigs;
    }

    public void answerPhone(String incomingNumber)
    {
        System.out.println("You pick up the call from " + incomingNumber);
        System.out.println("You answered on a " + brand + " phone");
        this.toString();
    }

    //this converts the object to a string (and returns the string)
    public String toString()
    {
        return "CellPhone - " + brand + " (" +
                storageInGigs + " gigs) (" +
                volume + " volume)";
    }
}
