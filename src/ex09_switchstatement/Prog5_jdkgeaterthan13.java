package ex09_switchstatement;

public class Prog5_jdkgeaterthan13 {
    public static void main(String[] args) {
        int a = 675;
        switch (a) {
            case 199, 78, 76:
                System.out.println("Print the Number1:" + a);
                break;

            case 90, 100, 67:
                System.out.println("Print the Number2:" + a);
                break;

            default:
                System.out.println("Print the Number3:" + a);

        }
    }
}
