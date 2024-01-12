public class interfaceanonymous {
    public static void main(String[] args) {
        Innerinterfaceanonymous c1 = new Innerinterfaceanonymous() {
            public void display() {
                System.out.println("it call from object declaration");
            }
        };
        c1.display();
    }
}

/**
 * Innerinterfaceanonymous
 */
interface Innerinterfaceanonymous {

    void display();
}