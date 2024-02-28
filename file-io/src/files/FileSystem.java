package files;

import utils.Console;

import java.io.File;

public class FileSystem
{
    public static void main(String[] args)
    {
        String path = Console.getString("Enter a path to a file or folder");
        File fileOrFolder = new File(path);

        if (fileOrFolder.exists())
        {
            System.out.println("The file or folder exists!");

            if (fileOrFolder.isFile())
            {
                System.out.println("Found a file!");

                //print out the details of the file
                System.out.println("Absolute path: " + fileOrFolder.getAbsoluteFile());
                System.out.println("File size: " + fileOrFolder.length());
                System.out.println("Hidden: " + fileOrFolder.isHidden());
            }
            else if (fileOrFolder.isDirectory())
            {
                System.out.println("Found a folder!");

                File[] contents = fileOrFolder.listFiles();
                for (int i = 0; i < contents.length; i++)
                {
                    File thing = contents[i];
                    if (thing.isDirectory()) System.out.println("Dir: " + thing.getName());
                    else if (thing.isFile()) System.out.println("File: " + thing.getName());
                }
            }
            else
            {
                System.out.println("Not recognized!");
            }
        }
        else
        {
            System.out.println("File or folder not found!");
        }
    }
}
