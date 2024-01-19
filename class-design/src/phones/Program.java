package phones;

import phones.CellPhone;

public class Program
{
    public static void main(String[] args)
    {
        CellPhone iphone = new CellPhone();
        CellPhone samsung = new CellPhone("Samsung");
        CellPhone phone = new CellPhone("Samsung",
                5, "usb-a", 256);

//        System.out.println(iphone);
//        System.out.println(samsung);
//        System.out.println(phone);

        int[] numbers = new int[10];
        String[] words = new String[5];

        CellPhone[] familyPhones = new CellPhone[5];

        familyPhones[0] = new CellPhone("Google Pixel");
        familyPhones[1] = new CellPhone("Samsung", 10, "usb-c", 512);
        familyPhones[2] = new CellPhone();
        familyPhones[3] = new CellPhone("Google Pixel");
        familyPhones[4] = createIPhone();

        //turn the volume up on all the phones
        for (int i = 0; i < familyPhones.length; i++)
        {
            familyPhones[i].setVolume(6);
        }

        for (int i = 0; i < familyPhones.length; i++)
        {
            printPhone(familyPhones[i]);
        }
    }

    public static void printPhone(CellPhone phone)
    {
        System.out.println("Phone ------------------");
        System.out.println("Type: " + phone.getBrand());
        System.out.println("Size: " + phone.getStorageInGigs());
        System.out.println("------------------------");
        System.out.println(); //new line
    }

    //this method returns a new IPhone
    public static CellPhone createIPhone()
    {
        CellPhone phone = new CellPhone("IPhone", 0, "thunderbolt",
                1024);
        return phone;
    }
}
