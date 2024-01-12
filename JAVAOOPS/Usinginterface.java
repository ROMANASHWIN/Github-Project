public class Usinginterface {
    public static void main(String[] args) {
        dogs d1 = new dogs();
        d1.sound();
        System.out.println(animal.name);
        // animal.name = "kumar";
        // System.out.println(animal.name);
    }
}

/**
 * interface
 */
interface animal {

    public static final String name = "Aswin";

    void sound();
}

class dogs implements animal {
    String name = "kumar";

    public void sound() {
        System.out.println("Bark Bark");
    }
}