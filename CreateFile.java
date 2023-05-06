import java.io.*;
//import java.lang.*

class CreateFile
{
    public static void main(String arg[]) throws Exception
    {
        File fobj = new File("Infosystems.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File succesfully Created..");
        }
        else
        {
            System.out.println("Unable to create the file..");
        }
    }
}