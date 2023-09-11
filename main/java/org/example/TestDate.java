package org.example;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDate {
    public static void main(String[] args) {
        // Initialize scanner and read inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("$ Please fill a day (1-31): ");
        int day = sc.nextInt();

        System.out.print("$ Please fill a month (1-12): ");
        int month = sc.nextInt();

        System.out.print("$ Please fill a year: ");
        int year = sc.nextInt();
        sc.close();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Months in Calendar class are 0-based


        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String formattedDate = dateFormat.format(calendar.getTime());


        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);


        System.out.println("$ The date is: " + formattedDate);
        System.out.println("$ The day of week is: " + dayOfWeek);
    }
}
