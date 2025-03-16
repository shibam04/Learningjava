package ternary_operator;

import java.util.Scanner;

public class Taskternary
{
    public static void main(String[] args)
    {
        System.out.print("Please Enter Number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        char grade=(x>=90 && x<=100)?'A': (x>=80 && x<=89)?'B': (x>=70 && x<=79)?'C':
                (x>=60 && x<=69)?'D':'E';
        System.out.println("You grade is:"+ grade);
    }
}
