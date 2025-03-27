package ex13_dowhile;

public class Task1_Fizzbuzz
{
    public static void main(String[] args)
    {
         for(int i=0;i<=100;i++)
         {
             if(i%3==0 && i%5==0)
             {
                 System.out.println("FizzBuzz");
             } else if (i%3==0)
             {
                 System.out.println("Fizz");
             }
             else if(i%5==0)
             {
                 System.out.println("Buzz");
             }
             else
             {
                 System.out.println("Number neither divisible by 3 or 5:"+i);

             }
         }
    }
}
