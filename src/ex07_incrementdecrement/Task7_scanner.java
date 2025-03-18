package ex07_incrementdecrement;

import java.util.Scanner;

public class Task7_scanner
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1ST NUMBER:");
        int x=sc.nextInt();
        System.out.println("The Number is:"+x);
        System.out.print("Enter 2ND NUMBER:");
        int y=sc.nextInt();
        System.out.println("The Number is:"+y);
        System.out.print("Enter 3RD NUMBER:");
        int z=sc.nextInt();
        System.out.println("The Number is:"+z);
        if (x==y && y==z)
        {
            System.out.println("The triangle is equilateral");
        }
        else if(x == y || x == z || y==z)
        {
            System.out.println("The triangle is isosceles");
        }
        else
        {
            System.out.println("The triangle is scalene");
        }

    }
}
