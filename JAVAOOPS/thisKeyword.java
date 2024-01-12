public class thisKeyword {
    public static void main(String[] args) {
        InnerthisKeyword obj = new InnerthisKeyword(2, 5);

    }
}

class InnerthisKeyword {
    int a;
    int b;

    InnerthisKeyword(int a, int b) {
        this.a = 5;
        this.b = 7;

    }

    add(this);

    public void add(InnerthisKeyword o) {
        int result = o.a + o.b;
        System.out.println(result);
    }

}
