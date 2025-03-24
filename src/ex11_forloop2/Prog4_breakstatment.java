package ex11_forloop2;

public class Prog4_breakstatment
{
    public static void main(String[] args)
    {
        for(int i=0;i<40;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even Number:"+i);
            }
            else
            {
                System.out.println("ODD:"+i);
            }
            if(i==30)
            {
                System.out.println("Just 30 Numbers where required");
                break;
            }

        }
    }
}
