import java.util.*;

class ExceptionDemo5
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;
        

        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter First Number : ");
        iNo2 = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
             iAns = iNo1 /iNo2;
        }
        catch(ArithmeticException aobj)           //Specific Ctach
        {
            System.out.println("Inside Catch block");
            System.out.println(aobj);
        }
        catch(Exception eobj)                    //Generic Catch
        {
            System.out.println("Inside Generic Catch");
        }

          System.out.println("Division is  : "+iAns);

    }
}