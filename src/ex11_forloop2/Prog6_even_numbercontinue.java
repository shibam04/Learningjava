package ex11_forloop2;

public class Prog6_even_numbercontinue
{
    public static void main(String[] args)
    {
        for(int i=1;i<=50;i++)
        {
            if(i%2!=0)
                continue;
            else
                System.out.println("Even Number:"+i);

        }

    }
}
