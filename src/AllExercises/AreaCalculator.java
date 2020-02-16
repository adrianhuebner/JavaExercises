package AllExercises;

public class AreaCalculator {

    private static final double PI = Math.PI;

    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        double circleArea = radius * radius * PI;
        return circleArea;
    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            return -1;
        }
        double rectangleArea = x * y;
        return rectangleArea;
    }
}
