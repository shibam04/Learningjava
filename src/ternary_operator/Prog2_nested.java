package ternary_operator;

public class Prog2_nested
{
    public static void main(String[] args)
    {

        int salary=80000;
        String s=(salary>300000)?"Eligible for Infinia Card":(salary>70000)
                ?"Eligible for Millenum":"Eligible for No Card";
        System.out.println(s);

        int salary1=60000;
        String s1=(salary1>300000)?"Eligible for Infinia Card":(salary1>70000)
                ?"Eligible for Millenum":"Eligible for No Card";
        System.out.println(s1);

        int salary2=360000;
        String s2=(salary2>300000)?"Eligible for Infinia Card":(salary2>70000)
                ?"Eligible for Millenum":"Eligible for No Card";
        System.out.println(s2);
    }
}
