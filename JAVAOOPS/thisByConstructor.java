public class thisByConstructor {
    public static void main(String[] args) {
        InnerthisByConstructor obj = new InnerthisByConstructor(5, 6);
    }
}

/**
 * InnerthisByConstructor
 */
class InnerthisByConstructor {

    int a;
    int b;

    InnerthisByConstructor(int a, int b) {
        this(a + b);
    }

    InnerthisByConstructor(int result) {
        int finalanswer = result * 2;
        System.out.println(finalanswer);
    }
}