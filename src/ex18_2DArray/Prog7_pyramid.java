package ex18_2DArray;

import java.util.Scanner;

public class Prog7_pyramid {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Row Value:");
            int r = sc.nextInt();
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<r-i-1;j++)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<=i;k++)
                {
                    System.out.print("* ");
                }
                System.out.println();

            }

        }
    }
}

