class InnerSuperClass {
    public void barking() {
        System.out.println("Woooow Woooow");
    }
}

class dog extends InnerSuperClass {
    public void barking() {

        System.out.println("looo looo");
        super.barking();

    }
}

public class SuperClass {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.barking();
    }
}
