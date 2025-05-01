package ex18_2DArray;

public class Prog3_starpattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i || j+i==4) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            n = n - 1;
        }
    }
}