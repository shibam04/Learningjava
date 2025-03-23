package ex09_switchstatement;

import java.util.Scanner;

public class Prog7
{
    public static void main(String[] args)
    {
       Scanner x= new Scanner(System.in);
        System.out.print("Enter Value:");
        int y=x.nextInt();
        switch(y)
        {
            case 10:
                System.out.println("Y1");
                break;
            case 12:
                System.out.println("y2");
                break;
            default:
                System.out.println("Y3");

        }
        x.close();
    }
}
