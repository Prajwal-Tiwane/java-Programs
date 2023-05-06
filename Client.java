import java.net.*;
import java.io.*;

class Client
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client Application id running...");

        System.out.println("Client is waiting for connection");

        Socket s = new Socket("localhost",2100);

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1,str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.println("Enter meassage for server : ");
            str2 = br1.readLine();
            System.out.println("Server says : "+str2);
        }
        System.out.println("Thank you for using Chat Messenger...");

    }
}