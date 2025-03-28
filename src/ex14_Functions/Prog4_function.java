package ex14_Functions;

public class Prog4_function
{
    public static void main(String[] args)
    {
        T1();
        int x=T2();
        System.out.println("Print number:"+x);
        T3("Shibam",29);
        String y=T4(90000.00);
        System.out.println("Value:"+y);


    }

    // Function without return type and argument
    public static void T1()
    {
        System.out.println("Function without return type and argument");
    }
    // Function with return type and without argument
    public static int T2()
    {
        System.out.println("Function with return type and without argument");
        return 10;
    }
    // Function without return type and with argument
    public static void T3(String Name,int age)
    {
        System.out.println("Function without return type and with argument");
        System.out.println("Name is:"+Name);
        System.out.println("Age is:"+age);

    }
    public static String T4(double salary)
    {
        System.out.println("Function with return type and with argument");
        return "Passing Value";
    }


}
