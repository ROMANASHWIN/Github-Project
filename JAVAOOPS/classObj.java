
public class classObj {

    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halgen = new Lamp();
        led.isturnOff();
        halgen.isturnOn();
    }
}

class Lamp {

    Boolean ison;

    void isturnOff() {
        System.out.println("Lamp is off");
    }

    void isturnOn() {
        System.out.println("Lamp is On");
    }

}
