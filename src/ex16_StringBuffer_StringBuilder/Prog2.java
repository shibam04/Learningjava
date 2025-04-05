package ex16_StringBuffer_StringBuilder;

public class Prog2
{
    public static void main(String[] args)
    {
         StringBuffer x=new StringBuffer("Hello");
          x.append(" Hi");
          System.out.println(x);
          x.delete(6,8);
        System.out.println("delete:"+x);
          x.replace(0,2,"Ge");
        System.out.println("replace:"+x);


    }
}
