package ex07_incrementdecrement;

public class Task6
{
    public static void main(String[] args)
    {
        String number1=args[0];
        String number2=args[1];
        String number3=args[2];

        int n1 =Integer.parseInt(number1);
        int n2 =Integer.parseInt(number2);
        int n3 =Integer.parseInt(number3);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        if (n1==n2 && n2==n3)
        {
            System.out.println("The triangle is equilateral");
        }
        else if(n1 == n2 || n1 == n3 || n2==n3)
        {
            System.out.println("The triangle is isosceles");
        }
        else
        {
            System.out.println("The triangle is scalene");
        }
    }
}


