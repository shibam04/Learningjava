package typecasting;

public class Prog2_narrowing
{
    public static void main(String[] args)
    {
        int x=200;
        byte a=(byte)x; //Valid Narrowing resulting in data loss
        System.out.println(a);
        float z=100f;
        long z1=(long)z;
        /**Valid Narrowing resulting in data loss
        float has a larger range but lower precision than long,
         leading to possible loss of precision but not overflow.**/
        System.out.println(z1);

        double z2=200;
        float z3=(float)z2;
        System.out.println(z3);

    }
}

