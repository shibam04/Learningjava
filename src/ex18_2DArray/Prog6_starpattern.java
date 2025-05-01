package ex18_2DArray;

import java.util.Scanner;

public class Prog6_starpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Value:");
        int r = sc.nextInt();
        System.out.print("Enter Column Value:");
        int c = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
            {
                if(j>=i && j+i<=2 || i+j==1 ||j+i==2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
