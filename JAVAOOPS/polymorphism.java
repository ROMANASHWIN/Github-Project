public class polymorphism {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.render();
        circle cir = new circle();
        cir.render();
    }
}

/**
 * Innerpolymorphism
 */
class Innerpolymorphism {

    void render() {
        System.out.println("it i polygon");
    }
}

class rectangle extends Innerpolymorphism {
    void render() {
        System.out.println("it is rectangle");
    }
}

class circle extends Innerpolymorphism {
    void render() {
        System.out.println("it is circle");
    }
}
