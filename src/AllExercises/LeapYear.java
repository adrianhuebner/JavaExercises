package AllExercises;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if((year >= 1 && year < 9998)
        && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
            System.out.println("This is a leap year");
            return true;
        }
        System.out.println("This isn't a leap year");
        return false;
    }
}
