package ex07_incrementdecrement;

public class Prog5_prepost
{
    public static void main(String[] args) {
        int a=10;
        int x=++a + a++;
        int y=a++ + ++a;
        System.out.println(x);
        System.out.println(y);

    }
}

// Line / a / Expression(x)
// 6   / 10/ NA
//7   A -> ++a ->11      B -> a++ -> 11  x->22
//8   A -> a++ ->12  a->13    B -> ++a -> 14  x->26