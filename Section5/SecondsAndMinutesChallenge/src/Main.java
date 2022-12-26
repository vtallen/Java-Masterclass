public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3695));
        System.out.println(getDurationString(61, 100));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Input";
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsFinal = seconds % 60;

        return hours + "h " + minutes + "m " + secondsFinal + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        seconds += minutes * 60;
        return getDurationString(seconds);
    }


}