// public class constructor {

//     public static void main(String[] args) {
//         Outerconstructor obj = new Outerconstructor();
//     }
// }

// public class Outerconstructor {
//     int number;

//     Outerconstructor() {
//         System.out.println("This is call by constructor");
//     }
// }
class constructor {

    String language;

    // constructor with no parameter
    constructor() {
        System.out.println("constructor would work");
    }

    // constructor with a single parameter
    constructor(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        constructor obj1 = new constructor();
        System.out.println(obj1.language);

        // call constructor with a single parameter
        constructor obj2 = new constructor("Python");

        obj1.getName();
        obj2.getName();
    }
}