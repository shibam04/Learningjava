package ex14_Functions;

import java.util.Scanner;

public class Prog5_Arithmetic
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter 1st Number:");
         int x=0;
         if(sc.hasNextInt())
         {
             x= sc.nextInt();
         }
         else
         {
             System.out.println("Please enter integer Value");
             System.exit(0);
         }
        System.out.print("Enter 2nd Number:");
        int y=0;
        if(sc.hasNextInt())
        {
            y= sc.nextInt();
        }
        else
        {
            System.out.println("Please enter integer Value");
            System.exit(0);
        }
         Addition(x,y);
         Subtraction(x,y);
         Division(x,y);
         Multiplication(x,y);


    }
        public static void Addition(int x,int y)
        {
            System.out.println("Sum of 2 numbers is:"+(x+y));
        }
    public static void Subtraction(int x,int y)
    {
        System.out.println("Subtraction of 2 numbers is:"+(x-y));
    }
    public static void Division(int x,int y)
    {
        if(y==0)
        {
            System.out.println("Please Enter Value other than Zero");
        }
        else {
            System.out.println("Division of 2 numbers is:"+(x/y));

        }

    }
    public static void Multiplication(int x,int y)
    {
        System.out.println("Multiplication of 2 numbers is:"+(x*y));
    }

}
