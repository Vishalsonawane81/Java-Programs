
class Demo
{
    public int i;
    public static int j;

    static
    {
        j = 21;
    }

    public Demo()
    {
        System.out.println("Inside default Constructor");
        this.i = 11;        
    }

    public Demo(int a)
    {
        this();                //First use    To call the constructor of the same class explicitly.
        System.out.println("Inside parametrised Constructor");
        this.Display();        //Second use    // To call the method Display
    }

    public void Display()
    {
        System.out.println("Inside Display"+this.i);   //Third use  // To access the non static Characterristics Of the Same class 
    }

}

class ThisDemo
{
    public static void main(String A[])
    {

        Demo dobj = new Demo(51);

    }
}