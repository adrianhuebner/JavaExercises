package AllExercises;

public class Main {

    public static void main(String[] args) {

        int timeIs = 18;
        boolean barking = true;
        BarkingDog.shouldWakeUp(barking, timeIs);

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        int kilobytes = 50;
        MegaBytesConverter.printMegaBytesAndKiloBytes(kilobytes);

        int thisYear = 2020;
        LeapYear.isLeapYear(thisYear);

        double firstDec = 2.457;
        double secondDec = 2.457;
        DecimalComparator.areEqualByThreeDecimalPlaces(firstDec, secondDec);

        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;
        EqualSumChecker.hasEqualSum(firstNumber, secondNumber, thirdNumber);

        String calculation = SecondsAndMinutes.getDurationString(80, 50);
        System.out.println(calculation);

        String basedOffSeconds = SecondsAndMinutes.getDurationString(3945L);
        System.out.println(basedOffSeconds);
    }
}
