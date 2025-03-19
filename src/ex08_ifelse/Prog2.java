package ex08_ifelse;

public class Prog2
{
    public static void main(String[] args)
    {
        float salary=90000.00f;
        if (salary>100000.00)
        {
            System.out.println("Eligible for HDFC Card");
        }
        else if (salary>91000 && salary<=100000)
        {
            System.out.println("Eligible for ICICI card");
        }
        else
        {
            System.out.println("Eligible for SBI Card");
        }

    }
}
