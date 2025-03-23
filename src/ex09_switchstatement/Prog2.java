package ex09_switchstatement;

import java.util.Scanner;

public class Prog2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter browser value:");
        String browser=sc.next();
        switch(browser)
        {
            case "chrome":
                System.out.println("Opening Chrome browser");
                break;
            case "firefox":
                System.out.println("Opening firefox");
                break;
            default:
                System.out.println("Opera Browser not supported");

        }
        System.out.println("Done");


    }
}
