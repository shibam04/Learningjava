package ex17_array;

import java.util.Scanner;

public class Prog4_Sum_of_Array
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
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Total Sum is:"+sum);

    }
}
