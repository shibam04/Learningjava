package ex17_array;

import java.util.Scanner;

public class Prog2Max_Min
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int []x=new int[5];
        for(int i=0;i<x.length;i++)
        {
            System.out.print("Enter Number:");
            x[i]=sc.nextInt();

        }
        int max_output=x[0];
        int min_output =x[0];
        for(int i=0;i<x.length;i++)
            if (x[i] >= max_output) {
                System.out.println("Max Value:" + x[i]);
                max_output = x[i];
            } else if (x[i] <= min_output) {
                System.out.println("Min Value:" + x[i]);
                min_output = x[i];
            }
        System.out.println("*************** Max and Min Values ***********************");
        System.out.println("Max Value is:"+ max_output);
        System.out.println("Min Value is:"+ min_output);








    }
}

