package ex07_incrementdecrement;

public class Task4
{
    public static void main(String[] args)
    {
        int a=20;
        int x=--a + a++ + a--;
        System.out.println(x);
        System.out.println(a);
    }
}

// Line / a / Expression(x)
// 7   / 20/ NA
//8  A -> --a ->19      B -> a++ -> 19    a-> 20    C-> a-- -> 20  x->(A+B+C)=58
//9  x -> 58
//10 a -> 19

