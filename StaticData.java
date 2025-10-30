
class Demo
{
    public int i,j;
    static public int j=11;

    public Demo()
    {
        this.i=11;
    }

}

class StaticData
{
    public static void main(String a[])
    {
        System.out.println(Demo.j);
        Demo.dobj = new Demo();
        System.out.println(Demo.i);



    }
}