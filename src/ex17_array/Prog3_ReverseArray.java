package ex17_array;

import java.util.Scanner;

public class Prog3_ReverseArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array length:");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter user Input:");
            a[i]=sc.nextInt();
        }
        System.out.println("Length:"+a.length);

        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println("Reverse:"+a[i]);
        }



    }
}
