public class enumToString {
    public static void main(String[] args) {
        Size size = Size.MEDIUM;
        System.out.println(size.toString());
    }
}

enum Size {
    SMALL {

        public String toString() {
            return "This is small size";
        }

    },

    MEDIUM {

        public String toString() {
            return "This is small size";
        }

    },
    LARGE {

        public String toString() {
            return "This is small size";
        }
    };
}