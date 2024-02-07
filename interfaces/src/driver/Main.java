package driver;

import devices.AlarmClock;
import devices.Camera;
import devices.Phone;
import interfaces.CaptureDevice;
import interfaces.Noisy;

public class Main
{
    public static void main(String[] args)
    {
        Phone myPhone = new Phone("Samsung Fold");
        Phone iPhone = new Phone("IPhone");
        Phone anotherPhone = new Phone("Pixel");
        AlarmClock clock = new AlarmClock();
        Camera cam = new Camera();

        double batteryLeft = myPhone.getBatteryLevel();
        myPhone.makeNoise("bzzzz");
        myPhone.selfie();
        clock.makeNoise("brrr");

        //group together objects based on their type
        Noisy[] noiseMakers = {myPhone, iPhone, anotherPhone, clock};
        CaptureDevice[] devices = {myPhone, iPhone, cam};

        System.out.println();
        for (int i = 0; i < noiseMakers.length; i++)
        {
            printNoiseMaker(noiseMakers[i]);
        }

        System.out.println();
        for (int i = 0; i < devices.length; i++)
        {
            devices[i].selfie();
        }
    }

    public static void printNoiseMaker(Noisy noiseMaker)
    {
        System.out.println(noiseMaker);
        noiseMaker.makeNoise("buzzzzz");
        noiseMaker.changeVolume(5);
    }
}
