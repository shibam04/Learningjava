package ex15_string;

public class Prog4_funccharat
{
    public static void main(String[] args)
    {
      String name="Shibam seal";
      int x=name.length();
      System.out.println(x);
      char s=name.charAt(5);
      System.out.println(s);
      for(int i=x-1;i>=0;i--)
        {
            char ch=name.charAt(i);
            System.out.print(ch);
        }
    }
}
