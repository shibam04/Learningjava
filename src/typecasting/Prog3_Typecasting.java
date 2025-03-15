package typecasting;

public class Prog3_Typecasting
{
    public static void main(String[] args)
    {
        float a=18.45f;
        int b=100;
        int z= (int)a+b;
        System.out.println("Explicit Casting Narrowing:"+z);

        float k=(float)a+b;
        System.out.println("Explicit Casting Widening:"+k);


    }
}
