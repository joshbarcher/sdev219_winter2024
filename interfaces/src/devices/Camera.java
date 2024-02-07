package devices;

import interfaces.CaptureDevice;

public class Camera implements CaptureDevice
{
    @Override
    public void capture(String subject)
    {
        System.out.println("The camera takes a picture of " + subject);
    }

    @Override
    public void selfie()
    {
        System.out.println("You take a selfie with the Camera");
    }
}
