enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY;

    private Day() {
        System.out.println("It is constructor");
    }
}
/*
 * class Day{
 * public static final SUNDAY;
 * public static final MONDAY;
 * public static final TUESDAY;
 * Day day = new Day();
 * }
 */

public class enumeg {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("It is working day");
                break;
            case TUESDAY:
                System.out.println("It is working day");
                break;
            case WEDNESDAY:
                System.out.println("It is working day");
                break;
            case THURSDAY:
                System.out.println("It is Holiday");
                break;
            default:
                System.out.println("It is Error");
                break;
        }
    }

}
