
class Demo
{
    public int i,j;
    static public int j = 11;

    public Demo()
    {
        this.i=11;
    }

    public void fun()      //Instance Method
    {
        System.out.println("fun i :"+this.i);
        System.out.println("fun j :"+Demo.j);
    }

    public static void gun()      //Class Method
    {
        // System.out.println("gun i :"+this.i);    //not Allowed
        System.out.println("gun j :"+Demo.j);
    }

}

class StaticData
{
    public static void main(String a[])
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dobj =  Demo();

        System.out.println(Demo.i);

        dobj.fun();
    }
}