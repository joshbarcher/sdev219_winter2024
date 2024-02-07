package devices;

import interfaces.Noisy;

public class AlarmClock implements Noisy
{
    private int alarmLevel = 4;

    @Override
    public void makeNoise(String type)
    {
        System.out.println("Alarm goes " + type);
    }

    @Override
    public int getVolume()
    {
        return alarmLevel;
    }

    @Override
    public void changeVolume(int level)
    {
        alarmLevel = level;
    }
}
