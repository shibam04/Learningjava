package ex17_array;

import java.util.Scanner;

public class Prog1
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

         for(int i=0;i<x.length;i++)
         {
             System.out.println("Print all the Numbers:"+x[i]);
         }




     }
}
