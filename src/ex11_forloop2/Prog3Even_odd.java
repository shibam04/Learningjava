package ex11_forloop2;

public class Prog3Even_odd
{
    public static void main(String[] args)
    {
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even Number:"+i);

            }
            else
            {
                System.out.println("ODD Number:"+i);
            }
        }
    }
}
