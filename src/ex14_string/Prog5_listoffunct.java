package ex14_string;

public class Prog5_listoffunct
{
    public static void main(String[] args)
    {
        String x1="Shibsams";
        String x2= " Seal";
        String x3=" Shibam Seal   ";
        String name=x1.concat(x2);
        System.out.println("My Full Name:"+name);
        System.out.println("Contains ba:"+x1.contains("ba"));
        System.out.println("Shibam matches:"+x1.equals("Shibam"));
        System.out.println("Find the index of s:"+x1.indexOf("s"));
        System.out.println("Last index of s:"+x1.lastIndexOf("s"));
        System.out.println("replace:"+x1.replace("bs","as"));
        System.out.println("Starts With:"+x1.startsWith("S"));
        System.out.println("Ends With:"+x1.endsWith("m"));
        System.out.println("Trim:"+x3.trim());
        System.out.println(" Compare:"+x2.compareTo("Seal"));
        System.out.println(" Compare:"+x1.compareTo("Shibsams"));
        System.out.println(" Compare:"+x1.compareTo("shibsams"));
        System.out.println("Substring:"+x1.substring(1,4));




        String email="shibam.seal4@gmail.com";
        String[] x=email.split("\\.");
        System.out.println(x.length);
        System.out.println("First:"+x[0]);
       System.out.println("2nd:"+x[1]);
       System.out.println("3rd:"+x[2]);

    }
}
