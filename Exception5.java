import java.lang.*;
import java.util.*;

class Demo 
{
    public int Division(int no1, int no2) throws ArithmeticException
    {
        return no1/no2;
    }
}
class Exception5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first number");
        int no1 = sobj.nextInt();
        System.out.println("Enter second number");
        int no2 = sobj.nextInt();
        Demo dobj = new Demo();
        try
        {
            int ret = dobj.Division(no1,no2);
            System.out.println("Division is :"+ret);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch");
        }
    }
}


/*

catch(Exception obj)
{
    System.out.println(obj);
    System.out.println(obj.printStackTrace());
    
}
ArithematicException obj = new ArithematicException();

Exception obj = new ArithematicException();
Exception obj = new ArrayIndexOutOfBounds();

*/