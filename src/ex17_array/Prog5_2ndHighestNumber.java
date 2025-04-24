package ex17_array;

import java.util.Arrays;
import java.util.Scanner;

public class Prog5_2ndHighestNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Length:");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter Number:");
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("After Sorting:"+a[i]);
        }
        System.out.println();
        System.out.println("2nd Highest Number is:"+a[a.length-2]);

    }
}
