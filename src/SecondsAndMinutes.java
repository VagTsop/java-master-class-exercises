public class SecondsAndMinutes {

    public static void main(String args[]) {
        String time = getDurationString(65, 45);
        System.out.println(time);
        String MinutesToSecondsTime = getDurationString(3945);
        System.out.println(MinutesToSecondsTime);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 || seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int minutesToSeconds = minutes % 60;
            return hours + " hours " + minutesToSeconds + " minutes " + seconds + " seconds ";
        }
        return "invalid value";
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int minutesInSeconds = seconds % 60;
            return getDurationString(minutes, minutesInSeconds);
        }
        return "invalid value";
    }
}
