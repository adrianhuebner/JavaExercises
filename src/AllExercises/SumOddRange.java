package AllExercises;

public class SumOddRange {

    public static boolean isOdd(int number){
        if(number > 0){
            if(number % 2 != 0){
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if ((start <= 0 || end <= 0) || start > end) {
            return -1;
        }

        int sumOfOdds = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sumOfOdds += i;
            }
        }
        return sumOfOdds;
    }
}
