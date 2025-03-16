package ternary_operator;

public class prog3_maxnum
{
    public static void main(String[] args)
    {
        int x=10;
        int y=98;
        int z=-9;
        int largest=(x>y)?(x>z)?x:z:((y>z)?y:z);
        System.out.println(largest);
    }
}
