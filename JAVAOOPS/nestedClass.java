
/**
 * InnernestedClass
 */
class OuterNestedClass {

    String name;

    void carModel() {
        System.out.println("BMW");
    }

    public class InnernestedClass {

        void carEngine() {
            System.out.println("Powerfull engine");
        }
    }

}

public class nestedClass {
    public static void main(String[] args) {
        OuterNestedClass obj = new OuterNestedClass();
        obj.carModel();
        // Call 1st . is used to indicate the class // 2nd . is used to indicate the
        // outer object
        OuterNestedClass.InnernestedClass obj2 = obj.new InnernestedClass();
        obj2.carEngine();

    }
}