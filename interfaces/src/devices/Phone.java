package devices;

import interfaces.CaptureDevice;
import interfaces.Noisy;

public class Phone extends Computer implements Noisy, CaptureDevice
{
    private String brand;
    private int currentVolume = 5;

    public Phone(String brand)
    {
        super();
        this.brand = brand;
    }

    @Override
    public void makeNoise(String type)
    {
        System.out.println("The phone goes " + type);
    }

    @Override
    public int getVolume()
    {
        return currentVolume;
    }

    @Override
    public void changeVolume(int level)
    {
        if (level >= 0 && level <= 10)
        {
            currentVolume = level;
        }
    }

    @Override
    public void capture(String subject)
    {
        System.out.println("You take a picture of " +
                subject);
    }

    @Override
    public void selfie()
    {
        System.out.println("You take a selfie");
    }

    public String toString()
    {
        return "A " + brand + " phone";
    }
}
