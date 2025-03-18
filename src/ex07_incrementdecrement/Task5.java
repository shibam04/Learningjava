package ex07_incrementdecrement;

public class Task5
{
    public static void main(String[] args)
    {
        String number1=args[0];
        int n1 =Integer.parseInt(number1);
        System.out.println(n1);
        if (n1%2==0)
        {
            System.out.println("Number n1 is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
