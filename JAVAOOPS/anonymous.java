class anonymous {
    public static void main(String[] args) {
        SuperCar c2 = new SuperCar();
        SuperCar c1 = new SuperCar() {
            void display() {
                System.out.println("This is also car overiding from superclass ");
            }
        };
        c1.display();
        c2.display();
    }
}

class SuperCar {
    void display() {
        System.out.println("This is Car");
    }
}