/*
Time Converter
Convert a number of seconds into hours, minutes, and seconds.
*/

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.nextLine().trim());

        // Calculate hours, minutes, seconds
        int hour = (total / 3600);

        int value = (total - (hour * 3600));
        int min = value / 60;

        int sec = total - (hour * 3600) - (min * 60);
        System.out.println(hour + "h " + min + "m " + sec + "s");

        sc.close();
    }
}