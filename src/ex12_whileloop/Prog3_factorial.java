package ex12_whileloop;

import java.util.Scanner;

public class Prog3_factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number whose factorial Needs to be find out:");
        int x=sc.nextInt();
        int fact=1;
        if(x<=1)
        {
            System.out.println("factorial is:"+fact);
        }
        else
        {
            for(int i=1;i<=x;i++)
            {
                fact=fact*i;

            }
            System.out.println("Factorial of 5 is:"+fact);
        }

    }
}
