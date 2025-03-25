package ex12_whileloop;

import java.util.Random;
import java.util.Scanner;

public class Pog4_GuessGame
{
    public static void main(String[] args)
    {
        Random ran=new Random();
        int x= ran.nextInt(10)+1;
        int attempt=1;
        Scanner sc=new Scanner(System.in);
        while(attempt<6)
        {
            System.out.print("Enter Number:");
            int y=sc.nextInt();
            if(x==y)
            {
                System.out.println("Number of attempt taken to get correct answer:"+attempt);
                System.out.println("Random Number is:"+x);
                System.out.println("Enter Number is:"+y);
                break;
            }
            else
                attempt++;
                continue;
        }
    }
}
