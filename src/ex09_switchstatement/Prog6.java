package ex09_switchstatement;

public class Prog6
{
    public static void main(String[] args)
    {
        String a=args[0];
        String b=args[1];
        String c=args[2];
        int x=Integer.parseInt(b);
        switch(x)
        {
            case 2:
            System.out.println("INT 1 Data is:"+x);
            break;
            case 4:
            System.out.println("INT 2 Data is:"+x);
            break;
            default:
                System.out.println("Incorrect Input");



        }
    }
}
