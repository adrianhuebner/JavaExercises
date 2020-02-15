package AllExercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        firstNumber = (int)(firstNumber * 1000);
        secondNumber = (int)(secondNumber * 1000);
        if(firstNumber == secondNumber){
            System.out.println("These numbers match");
            return true;
        }
        System.out.println("These numbers don't match");
        return false;
    }
}
