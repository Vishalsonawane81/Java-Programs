
class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("Inside Hello Constructor");
        this.i = no+1;
    }
    public void Display()
    {
        System.out.println("Inside Hello Display");
    }
}

class Demo extends Hello
{
    public int i;

    public Demo(int a)
    {
        super(a);                       //First Use    To call the parent class Constructor explicitly 
        System.out.println("Inside Demo Constructor");
        this.i = a;        
    }

    public void Display()
    {
        int i = 0;
        System.out.println("Inside Display"+i);          //0
        System.out.println("Inside Display"+this.i);     //51
        System.out.println("Inside Display"+super.i);    //52     //Second Use    To access the non static characteristics of the parent class 
        super.Display();                 //Third use     // To call the function or method of the parent class
    }

}

class SuperDemo
{
    public static void main(String A[])
    {

        Demo dobj = new Demo(51);

        dobj.Display();
        
    }
}
