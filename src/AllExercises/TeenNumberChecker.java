package AllExercises;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstAge, int secondAge, int thirdNumber){
        if(firstAge >= 13 && firstAge <= 19
                || secondAge >= 13 && secondAge <= 19
                || thirdNumber >= 13 && thirdNumber <= 19){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int forthAge){
        if(forthAge >= 13 && forthAge <= 19){
            return true;
        }
        return false;
    }
}
