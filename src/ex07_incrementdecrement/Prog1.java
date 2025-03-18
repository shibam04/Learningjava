package ex07_incrementdecrement;

public class Prog1
{
    public static void main(String[] args)
    {
        String x=args[0];
        System.out.println(x);
        System.out.println(x instanceof String);
        int y=Integer.parseInt(x);
        String results=(y<=18)?"Child":(y>18 && y<=65)?"Adult":"Senior Citizen";
        System.out.println(results);

        String x1=args[1];
        System.out.println(x1);
        System.out.println(x1 instanceof String);
        int y1=Integer.parseInt(x1);
        String results1=(y1<=18)?"Child":(y1>18 && y1<=65)?"Adult":"Senior Citizen";
        System.out.println(results1);


    }
}
