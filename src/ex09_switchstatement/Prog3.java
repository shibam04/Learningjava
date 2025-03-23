package ex09_switchstatement;

public class Prog3
{
    public static void main(String[] args)
    {
           char c='A';
        System.out.println(c);
        switch(c)
        {
            case 69:
                System.out.println("ASCII 1");
                break;
            case 65:
                System.out.println("ASCII of A");
                break;
            default:
                System.out.println("Not Matching");
                break;
        }
    }
}
