package ex16_StringBuffer_StringBuilder;
import java.util.Scanner;

public class Task_Vowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String x=sc.nextLine();
        System.out.println();
        int vowel=0;
        int consonent=0;
        for(int i=0;i<=x.length()-1;i++)
        {
            switch(x.charAt(i))
            {
                case 'A','a','E','e','i','I','o','O','u','U':
                    vowel++;
                    break;
                default:
                    consonent++;
                    break;
            }

        }
        System.out.println("No of Vowels:"+vowel);
        System.out.println("No of Consonent:"+consonent);
    }
}
