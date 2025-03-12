package javaprog2operators;

public class Lab01
{
    public static void main(String[] args)
    {
        int x=10;
        int y=10;
        int z=10;
        double a;
        double b;
        double c;
        a=Math.pow(x,2)+Math.pow(y,2)-z;
        //Way 1
        b=Math.pow(a,1.0/3.0);
        //Way 2
        c=Math.cbrt(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
