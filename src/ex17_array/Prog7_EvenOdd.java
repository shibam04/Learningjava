package ex17_array;

import java.util.Scanner;

public class Prog7_EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array:");
        int y=sc.nextInt();
        int[] x =new int[y];
        for(int i=0;i<x.length;i++)
        {
            System.out.println("Enter Number:");
            x[i]=sc.nextInt();
        }
        for(int i=0;i<x.length;i++)
        {
            if(x[i]%2==0)
            {
                System.out.println("Even Number:"+x[i]);
            }
            else
            {
                System.out.println("Odd Number:"+x[i]);
            }
        }

    }
}
