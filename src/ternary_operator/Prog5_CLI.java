package ternary_operator;

public class Prog5_CLI
{
    public static void main(String[] args)
    {
        String x=args[0];

        System.out.println( x);
        System.out.println(x instanceof String);
        int y=Integer.parseInt(x);
        String results=(y<=18)?"Child":(y>18 && y<=65)?"Adult":"Senior Citizen";
        System.out.println(results);
    }
}
