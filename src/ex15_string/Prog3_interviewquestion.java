package ex15_string;

public class Prog3_interviewquestion
{
    public static void main(String[] args)
    {
        String x1="Hello";//In both  the case x1 and X2 is under Static pool Area number of
        String x2="Hello";    // string present is 1 as hello is same and x1 and x2 is pointing
                               //to Hello

        String z1=new String("Hello"); // here z1 z2 z3 is stored under Heap Area
        String z2=new String("Hello");  //also z1 z2 z3 is pointing to differnt paramater
        String z3=new String("hello");  //as new object is created

        System.out.println(x1==x2);
        System.out.println(x1==z3);
        System.out.println(z1==z3);
        System.out.println(z1.equals(x1));
        System.out.println(x1.equals(z3));
        System.out.println(x1.equalsIgnoreCase(z3));



    }
}
