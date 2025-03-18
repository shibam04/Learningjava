package ex07_incrementdecrement;

public class Task1
{
    public static void main(String[] args)
    {
        int a=10;
        int x=++a + a++ + a++;
        System.out.println(x);
        System.out.println(a);
    }
}

// Line / a / Expression(x)
// 7   / 10/ NA
//8  A -> ++a ->11      B -> a++ -> 11    a-> 12    C-> a++ -> 12  x->(A+B+C)=34
//9  x -> 34
//10 a ->  13
