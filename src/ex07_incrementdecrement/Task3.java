package ex07_incrementdecrement;

public class Task3
{
    public static void main(String[] args)
    {
        String number1=args[0];
        String number2=args[1];
        int n1 =Integer.parseInt(number1);
        int n2 =Integer.parseInt(number2);
        System.out.println(n1);
        System.out.println(n2);
        int z= n1>n2?n1:n2;
        System.out.println("Maximum Number using Ternary:"+ z);
        //Another Way to Find MAX Value
        int z1=Math.max(n1,n2);
        System.out.println("Maximum Number using Max function:"+z1);

    }
}
