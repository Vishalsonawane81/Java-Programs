
interface A
{
    int no = 11;
    void fun();

}

interface B
{
    int no = 21;
    void fun();

}

class Demo implements A,B //Multiple inheritance
{
    public void fun()
    {
        System.out.println("Inside fun"+no);   //no generate ERROR
    }
}

class InterfaceDremo6
{
    public static void main( String A[])

    {
        Demo dobj = new Demo();

        dobj.fun();
    }
}
