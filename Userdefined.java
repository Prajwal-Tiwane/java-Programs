import java.util.*;

class AgeInvailid extends Exception 
{
    public AgeInvailid(String str)
    {
        super(str);
    }
}
class Userdefined
{
    public static void main(String arg[])
    {
        int Age = 0;
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter your age");
            Age = sobj.nextInt();

            if(Age < 18)
            {
                throw new AgeInvailid("Age is less than 18");
            }
        }
        catch(AgeInvailid obj)
        {
            System.out.println(obj);
        }
    }
}