package ex13_dowhile;

import java.util.Scanner;

public class Prog1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int x=sc.nextInt();
        do
        {
            System.out.println("Before Increment Print:"+x);
            x++;
            System.out.println("After Increment Print:"+x);
        }while(x<40);
        {
            System.out.println("Came out of the loop");
        }
    }
}
