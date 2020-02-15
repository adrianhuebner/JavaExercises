package AllExercises;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if(barking && hourOfDay < 8 || hourOfDay > 22){
            System.out.println("Time to get up");
            return true;
        }
        System.out.println("Time to stay in bed");
        return false;
    }
}
