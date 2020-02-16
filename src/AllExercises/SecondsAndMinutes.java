package AllExercises;

public class SecondsAndMinutes {
    public static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0 || seconds > 59)){
            return "Invalid Value";
        }
        long totalHours = minutes / 60;
        long leftoverMinutes = minutes % 60;

        String hoursString = totalHours + " h ";
        if(totalHours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = leftoverMinutes + " m ";
        if(leftoverMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + " s";
        if(seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }
    public static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        long totalMinutes = seconds / 60;
        long leftoverSeconds = seconds % 60;
        return getDurationString(totalMinutes, leftoverSeconds);
    }
}
