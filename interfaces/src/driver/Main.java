package driver;

import devices.AlarmClock;
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

        myPhone.makeNoise("bzzzz");
        myPhone.selfie();
        clock.makeNoise("brrr");

        //group together objects based on their type
        Noisy[] noiseMakers = {myPhone, iPhone, anotherPhone, clock};

        System.out.println();
        for (int i = 0; i < noiseMakers.length; i++)
        {
            //print out each phone
            System.out.println(noiseMakers[i]);

            //have each phone make a noise
            noiseMakers[i].makeNoise("buzzzzz");
        }
    }
}
