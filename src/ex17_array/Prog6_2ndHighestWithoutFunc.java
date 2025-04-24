package ex17_array;
import java.util.*;

public class Prog6_2ndHighestWithoutFunc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array:");
        int y=sc.nextInt();
        int[] x =new int[y];
        for(int i=0;i<x.length;i++)
        {
            System.out.println("Enter Number:");
            x[i]=sc.nextInt();
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < x.length; i++) {
            // If current number is greater than 'first'
            if (x[i] > first) {
                second = first;    // previous largest becomes second largest
                first = x[i];    // update first
            }
            // If arr[i] is smaller than first but greater than second and not equal to first
            else if (x[i] > second && x[i] != first) {
                second = x[i];   // update second
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest number is: " + second);
        }

    }
}
