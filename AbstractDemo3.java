abstract class Base
{
    public int i,j;
    public int Addition(int A,int B) 
    {
        return A+B;
    }
    
    abstract public int Substraction(int A,int B); // Abstract
    
}

class Derived extends Base   
{
    public int Substraction(int A,int B)
    {
        return A-B;
    }
    public int Multiplication(int A,int B)  //ERROR
    {
        return A*B;
    }

}

class AbstractDemo3
{
    public static void main (String A[])
    {
       
        Base bp = new Derived();      //Upcasting
        int iret = 0;

        iret = bp.Addition(11,10);

        System.out.println(iret);
        
        iret = bp.Substraction(11,10);
        System.out.println(iret);

       // iret = bp.Multiplication(11,10);

        
         

    }
}
