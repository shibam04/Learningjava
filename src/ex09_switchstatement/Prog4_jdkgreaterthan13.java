package ex09_switchstatement;
import java.util.*;

public class Prog4_jdkgreaterthan13
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int x=s.nextInt();
        switch(x)
        {
            case 1 -> System.out.println("Number 1");
            case 2 -> System.out.println("Number 2");
            default -> System.out.println("Other Number");
        }



    }
}
