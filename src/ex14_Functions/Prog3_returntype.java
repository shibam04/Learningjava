package ex14_Functions;

public class Prog3_returntype {
    public static void main(String[] args) {
        int x = number();
        System.out.println("Number is:" + x);
        float y = number1();
        System.out.println("Number is:" + y);


    }

    public static int number() {
        return 10;
    }

    public static float number1() {
        return 1.2f;
    }
}




