public class polymorphic_variable {
    public static void main(String[] args) {
        java p1;
        p1 = new programmingLanguage();
        p1.display();
        p1 = new java();
        p1.display();
    }
}

class programmingLanguage {
    void display() {
        System.out.println("Im a Programming Language");
    }
}

class java extends programmingLanguage {
    void display() {
        System.out.println("Im a java");
    }
}