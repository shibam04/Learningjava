package ex15_string;

public class prog1
{
    public static void main(String[] args)
    {
         //String Constant Pool Area
        String x="Shibam";
        System.out.println("My Name is:"+x);

        //string Heap Area
        String y=new String("Seal");
        System.out.println("My Surname is:"+y);

    }
}
