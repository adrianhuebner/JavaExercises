package AllExercises;

public class DayOfTheWeekChallenge {
    public static void printDayOfTheWeek(int day) {
        String dayOfWeek;
        switch(day) {
            case 0:
                dayOfWeek = "Sunday";
                System.out.println("Today is " + dayOfWeek);
                break;
            case 1:
                dayOfWeek = "Monday";
                System.out.println("Today is " + dayOfWeek);
                break;
            case 2:
                dayOfWeek = "Tuesday";
                System.out.println("Today is " + dayOfWeek);
                break;
            case 3:
                dayOfWeek = "Wednesday";
                System.out.println("Today is " + dayOfWeek);
                break;
            case 4:
                dayOfWeek = "Thursday";
                System.out.println("Today is " + dayOfWeek);
                break;
            case 5:
                dayOfWeek = "Friday";
                System.out.println("Today is " + dayOfWeek);
                break;
            case 6:
                dayOfWeek = "Saturday";
                System.out.println("Today is " + dayOfWeek);
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
