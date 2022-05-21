import java.lang.*;
import java.util.*;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
            super(str);
    }
}
class Exception6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sobj.nextInt();
        try
        {
            if(age < 18)
            {
                throw new AgeInvalid("Age is below 18");
            }
        }
        catch(AgeInvalid obj)
        {
            System.out.println("Inside catch");
            System.out.println(obj);
        }
   }
}