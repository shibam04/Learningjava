package ex09_switchstatement;

import java.util.Scanner;

public class Prog1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
                System.out.println("Testing");
                break;
            case 2:
                System.out.println("Application");
                break;
            default:
                System.out.println("Wrong Number");

        }

    }
}
