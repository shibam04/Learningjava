package ex16_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Task_Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String x=sc.nextLine();
        // Way 1
        for(int i=x.length()-1;i>=0;i--)
        {
            char data=x.charAt(i);
            System.out.print(data);
        }
        System.out.println();


        //Way 2
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter the String:");
        StringBuilder y=new StringBuilder(sc1.nextLine());
        y.reverse().toString();
        System.out.println("Reverse using StringBuilder:"+y);


        //Way 3
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter the String:");
        String z=sc2.nextLine();
        String z1=Reverse(z);
        if(z1.equalsIgnoreCase(z))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }


    }
     public static String Reverse(String z)
     {
         String z2 = "";
    for(int j=z.length()-1;j>=0;j--)
     {
        z2=z2+z.charAt(j);
     }
    return z2;

    }
}
