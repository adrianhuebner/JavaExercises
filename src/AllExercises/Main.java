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
        DecimalCompartar.areEqualByThreeDecimalPlaces(firstDec, secondDec);
    }
}
