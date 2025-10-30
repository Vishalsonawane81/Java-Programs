import java.util.*;

class ExceptionDemo2
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;
         float Fans = 0;

        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter First Number : ");
        iNo2 = sobj.nextInt();

        Fans = (float)iNo1 / (float)iNo2;

          System.out.println("Division is  : "+Fans);
    }
}