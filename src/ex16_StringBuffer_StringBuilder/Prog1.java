package ex16_StringBuffer_StringBuilder;

public class Prog1
{
    public static void main(String[] args)
    {
        StringBuffer x=new StringBuffer("Shibam");
        x.append(" Seal");
        System.out.println(x);

        StringBuilder y=new StringBuilder("Jharna");
        y.reverse();
        System.out.println(y);

    }
}
