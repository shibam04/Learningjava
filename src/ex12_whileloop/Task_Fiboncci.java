package ex12_whileloop;

public class Task_Fiboncci
{
    public static void main(String[] args)
    {
          int x=0;
          int y=1;
          int z=0;
          for(int i=0;i<=4;i++)
          {
              z=x+y;
              x=y;
              y=z;

          }
        System.out.println("Fibonacci Series:"+z);
    }
}
